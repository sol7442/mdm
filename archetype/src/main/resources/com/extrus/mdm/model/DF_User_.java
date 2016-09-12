package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.560+0900")
@StaticMetamodel(DF_User.class)
public class DF_User_ {
	public static volatile SingularAttribute<DF_User, String> id;
	public static volatile SingularAttribute<DF_User, BigInteger> actionCompany;
	public static volatile SingularAttribute<DF_User, String> actionSource;
	public static volatile SingularAttribute<DF_User, BigInteger> actionTime;
	public static volatile SingularAttribute<DF_User, BigInteger> actionUser;
	public static volatile SingularAttribute<DF_User, BigInteger> companyId;
	public static volatile SingularAttribute<DF_User, Date> createDate;
	public static volatile SingularAttribute<DF_User, BigInteger> credentialId;
	public static volatile SingularAttribute<DF_User, String> customUserType;
	public static volatile SingularAttribute<DF_User, BigInteger> deptId;
	public static volatile SingularAttribute<DF_User, String> email;
	public static volatile SingularAttribute<DF_User, Byte> isLock;
	public static volatile SingularAttribute<DF_User, Integer> isUse;
	public static volatile SingularAttribute<DF_User, String> lastAccessIp;
	public static volatile SingularAttribute<DF_User, BigInteger> lastAccessTime;
	public static volatile SingularAttribute<DF_User, Integer> lockCnt;
	public static volatile SingularAttribute<DF_User, String> membernum;
	public static volatile SingularAttribute<DF_User, String> name;
	public static volatile SingularAttribute<DF_User, String> password;
	public static volatile SingularAttribute<DF_User, Date> passwordChangeDate;
	public static volatile SingularAttribute<DF_User, String> permAccessIp1;
	public static volatile SingularAttribute<DF_User, String> permAccessIp2;
	public static volatile SingularAttribute<DF_User, Integer> roleType;
	public static volatile SingularAttribute<DF_User, BigInteger> titleId;
	public static volatile SingularAttribute<DF_User, Date> updateDate;
	public static volatile SingularAttribute<DF_User, String> username;
}
