package com.xworkz.collegeadmission.dto;

public class MovieTicketDto {

	String name;
	String totalTickets;
	String theaterName;
	String seatType;
	String donation;
	String date;
	String time;

	public MovieTicketDto() {
		super();
	}

	public MovieTicketDto(String name, String totalTickets, String theaterName, String seatType, String donation,
			String date, String time) {
		super();
		this.name = name;
		this.totalTickets = totalTickets;
		this.theaterName = theaterName;
		this.seatType = seatType;
		this.donation = donation;
		this.date = date;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTotalTickets() {
		return totalTickets;
	}

	public void setTotalTickets(String totalTickets) {
		this.totalTickets = totalTickets;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	public String getDonation() {
		return donation;
	}

	public void setDonation(String donation) {
		this.donation = donation;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((donation == null) ? 0 : donation.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((seatType == null) ? 0 : seatType.hashCode());
		result = prime * result + ((theaterName == null) ? 0 : theaterName.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + ((totalTickets == null) ? 0 : totalTickets.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieTicketDto other = (MovieTicketDto) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (donation == null) {
			if (other.donation != null)
				return false;
		} else if (!donation.equals(other.donation))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (seatType == null) {
			if (other.seatType != null)
				return false;
		} else if (!seatType.equals(other.seatType))
			return false;
		if (theaterName == null) {
			if (other.theaterName != null)
				return false;
		} else if (!theaterName.equals(other.theaterName))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (totalTickets == null) {
			if (other.totalTickets != null)
				return false;
		} else if (!totalTickets.equals(other.totalTickets))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MovieTicketDto [name=" + name + ", totalTickets=" + totalTickets + ", theaterName=" + theaterName
				+ ", seatType=" + seatType + ", donation=" + donation + ", date=" + date + ", time=" + time + "]";
	}

}
