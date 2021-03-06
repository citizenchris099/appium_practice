package com.scienergy.development;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class TestPOJO {

	private String adminUName;
	private String adminPword;
	private String advUname;
	private String advPword;
	private String miscUname001;
	private String miscPword001;
	private String miscUname002;
	private String sbRegUrl;
	private String sbLogOnUrl;
	private String sbPUUrl;
	private String sbPUDyUrl;
	private String sbProjConf;
	private String sbUAUrl;
	private String sbOCOurl;
	private String sbPIUrl;
	private String sbHome;
	private String sbSchoolInfoUrl;
	

	public TestPOJO() {
	}


	public String getSbSchoolInfoUrl() {
		return sbSchoolInfoUrl;
	}


	public void setSbSchoolInfoUrl(String sbSchoolInfoUrl) {
		this.sbSchoolInfoUrl = sbSchoolInfoUrl;
	}


	public String getSbHome() {
		return sbHome;
	}


	public void setSbHome(String sbHome) {
		this.sbHome = sbHome;
	}


	public String getSbPIUrl() {
		return sbPIUrl;
	}


	public void setSbPIUrl(String sbPIUrl) {
		this.sbPIUrl = sbPIUrl;
	}


	public String getSbOCOurl() {
		return sbOCOurl;
	}


	public void setSbOCOurl(String sbOCOurl) {
		this.sbOCOurl = sbOCOurl;
	}


	public String getSbPUDyUrl() {
		return sbPUDyUrl;
	}


	public void setSbPUDyUrl(String sbPUDyUrl) {
		this.sbPUDyUrl = sbPUDyUrl;
	}


	public String getMiscPword001() {
		return miscPword001;
	}


	public void setMiscPword001(String miscPword001) {
		this.miscPword001 = miscPword001;
	}


	public String getSbUAUrl() {
		return sbUAUrl;
	}


	public void setSbUAUrl(String sbUAUrl) {
		this.sbUAUrl = sbUAUrl;
	}


	public String getSbProjConf() {
		return sbProjConf;
	}


	public void setSbProjConf(String sbProjConf) {
		this.sbProjConf = sbProjConf;
	}


	public String getAdminUName() {
		return adminUName;
	}


	public void setAdminUName(String adminUName) {
		this.adminUName = adminUName;
	}


	public String getAdminPword() {
		return adminPword;
	}


	public void setAdminPword(String adminPword) {
		this.adminPword = adminPword;
	}


	public String getAdvUname() {
		return advUname;
	}


	public void setAdvUname(String advUname) {
		this.advUname = advUname;
	}


	public String getAdvPword() {
		return advPword;
	}


	public void setAdvPword(String advPword) {
		this.advPword = advPword;
	}


	public String getMiscUname001() {
		return miscUname001;
	}


	public void setMiscUname001(String miscUname001) {
		this.miscUname001 = miscUname001;
	}


	public String getMiscUname002() {
		return miscUname002;
	}


	public void setMiscUname002(String miscUname002) {
		this.miscUname002 = miscUname002;
	}


	public String getSbRegUrl() {
		return sbRegUrl;
	}


	public void setSbRegUrl(String sbRegUrl) {
		this.sbRegUrl = sbRegUrl;
	}


	public String getSbLogOnUrl() {
		return sbLogOnUrl;
	}


	public void setSbLogOnUrl(String sbLogOnUrl) {
		this.sbLogOnUrl = sbLogOnUrl;
	}


	public String getSbPUUrl() {
		return sbPUUrl;
	}


	public void setSbPUUrl(String sbPUUrl) {
		this.sbPUUrl = sbPUUrl;
	}


	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TestPOJO) {
			TestPOJO other = (TestPOJO) obj;
			EqualsBuilder builder = new EqualsBuilder();
//			builder.append(this.login, other.login);
			return builder.isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
//		builder.append(login);
		return builder.toHashCode();
	}
}
