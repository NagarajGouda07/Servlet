package com.xworkz.collegeadmission.dto;

public class ConcertTicketDto {

	String location;
	String artistName;
	String ticketType;
	String noOfTickets;
	String preferenceType;

	public ConcertTicketDto() {
		super();
	}

	public ConcertTicketDto(String location, String artistName, String ticketType, String noOfTickets,
			String preferenceType) {
		super();
		this.location = location;
		this.artistName = artistName;
		this.ticketType = ticketType;
		this.noOfTickets = noOfTickets;
		this.preferenceType = preferenceType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public String getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(String noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public String getPreferenceType() {
		return preferenceType;
	}

	public void setPreferenceType(String preferenceType) {
		this.preferenceType = preferenceType;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artistName == null) ? 0 : artistName.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((noOfTickets == null) ? 0 : noOfTickets.hashCode());
		result = prime * result + ((preferenceType == null) ? 0 : preferenceType.hashCode());
		result = prime * result + ((ticketType == null) ? 0 : ticketType.hashCode());
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
		ConcertTicketDto other = (ConcertTicketDto) obj;
		if (artistName == null) {
			if (other.artistName != null)
				return false;
		} else if (!artistName.equals(other.artistName))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (noOfTickets == null) {
			if (other.noOfTickets != null)
				return false;
		} else if (!noOfTickets.equals(other.noOfTickets))
			return false;
		if (preferenceType == null) {
			if (other.preferenceType != null)
				return false;
		} else if (!preferenceType.equals(other.preferenceType))
			return false;
		if (ticketType == null) {
			if (other.ticketType != null)
				return false;
		} else if (!ticketType.equals(other.ticketType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ConcertTicketDto [location=" + location + ", artistName=" + artistName + ", ticketType=" + ticketType
				+ ", noOfTickets=" + noOfTickets + ", preferenceType=" + preferenceType + "]";
	}

}
