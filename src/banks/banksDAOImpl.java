package banks;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class banksDAOImpl implements banksDAO {
	banksVO n = new banksVO();

	private Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@192.168.0.28:1521:xe";
			conn = DriverManager.getConnection(dburl, "webdb", "webdb");
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버 로드 실패!");
		}
		return conn;
	}
	@Override
	public List<banksVO> getList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<banksVO> temp = new ArrayList<>();

		try {
			conn = getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT SEQ_ID, INS, OUTS, DATES , BAL FROM  bank";

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				banksVO temp2 = new banksVO(rs.getLong(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getInt(5));
				temp.add(temp2);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return temp;
	}

	public void deposit(int i) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int count = 0;
		try {
			conn = getConnection();
			String sql = "insert into bank values(BANKS.nextval,?,0,sysdate,?)";
			pstmt = conn.prepareStatement(sql);
			n.setBal(n.getBal() + i);
			pstmt.setInt(1, i);
			pstmt.setInt(2, n.getBal());

			count = pstmt.executeUpdate();
			if (count == 1) {
				System.out.println("입금완료");
				conn.commit();
			} else {
				System.out.println("입금실패");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void withdraw(int i) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int count = 0;
		if(i <= n.getBal()) {
		try {
			conn = getConnection();
			String sql = "insert into bank values(BANKS.nextval,0,?,sysdate,?)";
			pstmt = conn.prepareStatement(sql);
			n.setBal(n.getBal() - i);
			pstmt.setInt(1, i);
			pstmt.setInt(2, n.getBal());

			count = pstmt.executeUpdate();
			if (count == 1) {
				System.out.println("출금완료");
			} else {
				System.out.println("출금실패");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		}else if (i > n.getBal()){
			System.out.println("잔액이 부족합니다.");
		}
	}

	public int gets() {
		Connection conn = null;
		Statement pstmt = null;
		ResultSet rs = null;
		int temp = 0;
		try {
			conn = getConnection();

			String sql = "select bal from bank where seq_id = (select max(seq_id) from bank)";
			pstmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			rs = pstmt.executeQuery(sql);
			rs.last();
			temp = rs.getInt(1);
			n.setBal(temp);
		} catch (Exception e) {
			System.out.println("잔액 없음");
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return temp;
	}

	@Override
	public void search(String date) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<banksVO> list = new ArrayList<>();
		try {
			conn = getConnection();
			String sql = "select ins, outs, to_date(dates,'YY/MM/DD'), bal from bank where dates like to_date(?,'YY-MM-DD')order by seq_id asc";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, date);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				banksVO banksVO = new banksVO(

						rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4));
				list.add(banksVO);
			}List<banksVO> list1 = list;
			System.out.println("----------------------------------------------------------");
			for (banksVO temp4 : list1) {
				System.out.println(temp4);
			}
			System.out.println("----------------------------------------------------------");
		} catch (Exception e) {
			System.out.println("애러");
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				System.out.println("애러");
			}
		}
	}

	public void search(String date, String date2) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<banksVO> list = new ArrayList<>();
		try {
			conn = getConnection();
			String sql = "select ins, outs, TO_DATE(dates,'YY/MM/DD'), bal from bank where dates between ? and ? order by dates asc";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, date);
			pstmt.setString(2, date2);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				banksVO banksVO = new banksVO(
						rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4));
				list.add(banksVO);
			}List<banksVO> list1 = list;
			System.out.println("----------------------------------------------------------");
			for (banksVO temp4 : list1) {
				System.out.println(temp4);
			}
			System.out.println("----------------------------------------------------------");
		} catch (Exception e) {
			System.out.println("애러");
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				System.out.println("애러");
			}
		}
	}
}
