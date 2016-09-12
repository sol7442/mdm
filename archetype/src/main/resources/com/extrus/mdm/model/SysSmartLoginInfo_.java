package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.594+0900")
@StaticMetamodel(SysSmartLoginInfo.class)
public class SysSmartLoginInfo_ {
	public static volatile SingularAttribute<SysSmartLoginInfo, String> id;
	public static volatile SingularAttribute<SysSmartLoginInfo, BigInteger> actionCompany;
	public static volatile SingularAttribute<SysSmartLoginInfo, String> actionSource;
	public static volatile SingularAttribute<SysSmartLoginInfo, BigInteger> actionTime;
	public static volatile SingularAttribute<SysSmartLoginInfo, BigInteger> actionUser;
	public static volatile SingularAttribute<SysSmartLoginInfo, String> address;
	public static volatile SingularAttribute<SysSmartLoginInfo, Date> createDate;
	public static volatile SingularAttribute<SysSmartLoginInfo, Date> loginDt;
	public static volatile SingularAttribute<SysSmartLoginInfo, Date> logoutDt;
	public static volatile SingularAttribute<SysSmartLoginInfo, String> name;
	public static volatile SingularAttribute<SysSmartLoginInfo, String> note;
	public static volatile SingularAttribute<SysSmartLoginInfo, Date> updateDate;
	public static volatile SingularAttribute<SysSmartLoginInfo, BigInteger> userId;
}
