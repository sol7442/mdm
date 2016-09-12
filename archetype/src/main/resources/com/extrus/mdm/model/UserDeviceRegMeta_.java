package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.601+0900")
@StaticMetamodel(UserDeviceRegMeta.class)
public class UserDeviceRegMeta_ {
	public static volatile SingularAttribute<UserDeviceRegMeta, String> id;
	public static volatile SingularAttribute<UserDeviceRegMeta, BigInteger> actionCompany;
	public static volatile SingularAttribute<UserDeviceRegMeta, String> actionSource;
	public static volatile SingularAttribute<UserDeviceRegMeta, BigInteger> actionTime;
	public static volatile SingularAttribute<UserDeviceRegMeta, BigInteger> actionUser;
	public static volatile SingularAttribute<UserDeviceRegMeta, String> activityId;
	public static volatile SingularAttribute<UserDeviceRegMeta, Date> createDate;
	public static volatile SingularAttribute<UserDeviceRegMeta, String> deviceType;
	public static volatile SingularAttribute<UserDeviceRegMeta, String> emailAddress;
	public static volatile SingularAttribute<UserDeviceRegMeta, String> name;
	public static volatile SingularAttribute<UserDeviceRegMeta, String> requestVersion;
	public static volatile SingularAttribute<UserDeviceRegMeta, Date> updateDate;
}
