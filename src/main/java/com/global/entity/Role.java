package com.global.entity;

import javax.persistence.Entity;

@Entity
public class Role {

	// instance variable
	private int roleId;
	private String roleName;

	// default constructor
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	// paramertized constructor
	public Role(int roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + "]";
	}

}
