package beans;

import java.io.Serializable;

public class Appoint_Meisai_Beans implements Serializable {

	//引数の生成//
	private int appoint_meisai_id;
	private int appoint_id;
	private int seat_id;
	private int fee_id;

	//getterとsetterの生成//
	public int getAppoint_meisai_id() {
		return appoint_meisai_id;
	}
	public void setAppoint_meisai_id(int appoint_meisai_id) {
		this.appoint_meisai_id = appoint_meisai_id;
	}
	public int getAppoint_id() {
		return appoint_id;
	}
	public void setAppoint_id(int appoint_id) {
		this.appoint_id = appoint_id;
	}
	public int getSeat_id() {
		return seat_id;
	}
	public void setSeat_id(int seat_id) {
		this.seat_id = seat_id;
	}
	public int getFee_id() {
		return fee_id;
	}
	public void setFee_id(int fee_id) {
		this.fee_id = fee_id;
	}
}