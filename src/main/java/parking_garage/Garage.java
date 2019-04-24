package parking_garage;

public class Garage {

	 int inTime;
	 int outTime;
	 boolean isMonthly;
	 int totalTime;
	 final static int rate = 5;
	 double charge;

	public Garage(double inTime, double outTime, boolean isMonthly, double totalTime) {
		super();
		this.inTime = inTime;
		this.outTime = outTime;
		this.isMonthly = isMonthly;
		this.totalTime = totalTime;
	}

	public Garage() {
	}

	public double CalulateTime(double inTime, double outTime) {
		if (inTime <= outTime) {
			totalTime = (double(outTime - inTime));
		} else {
			System.out.println(" error in time ");
			totalTime = -1;
		}

		return totalTime;
	}

	public double getInTime() {
		return inTime;
	}

	public void setInTime(double inTime) {
		this.inTime = inTime;
	}

	public double getOutTime() {
		return outTime;
	}

	public void setOutTime(double outTime) {
		this.outTime = outTime;
	}

	public boolean isMonthly() {
		return isMonthly;
	}

	public void setMonthly(boolean isMonthly) {
		this.isMonthly = isMonthly;
	}

	public double getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(double totalTime) {
		this.totalTime = totalTime;
	}

	@Override
	public String toString() {
		return "Garage [inTime=" + inTime + ", outTime=" + outTime + ", isMonthly=" + isMonthly + ", totalTime="
				+ totalTime + "]";
	}

	public double Compute(double totalspent,boolean isMonthly) {
		if (isMonthly == "False")
		{
		charge = totalspent * rate;

		}
		else
		{
			charge = 0;
		}
		return charge;
	}

}
