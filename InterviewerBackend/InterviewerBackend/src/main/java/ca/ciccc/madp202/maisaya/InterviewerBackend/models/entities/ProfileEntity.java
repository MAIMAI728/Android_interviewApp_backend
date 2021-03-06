package ca.ciccc.madp202.maisaya.InterviewerBackend.models.entities;

import java.io.Serializable;
import java.util.Date;

public class ProfileEntity implements Serializable{

	private String authtoken;
	private int userid;
	private Date joined;
	private UserEntity userProfile;
	
	public ProfileEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public ProfileEntity(String authtoken, int userid, Date joined, UserEntity userProfile) {
		this.authtoken = authtoken;
		this.userid = userid;
		this.joined = joined;
		this.userProfile = userProfile;
	}

	public String getAuthtoken() {
		return authtoken;
	}

	public void setAuthtoken(String authtoken) {
		this.authtoken = authtoken;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public Date getJoined() {
		return joined;
	}

	public void setJoined(Date joined) {
		this.joined = joined;
	}

	public UserEntity getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserEntity userProfile) {
		this.userProfile = userProfile;
	}
	
	
	
}
