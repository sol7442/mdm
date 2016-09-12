package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.600+0900")
@StaticMetamodel(UserDeviceRegInit.class)
public class UserDeviceRegInit_ {
	public static volatile SingularAttribute<UserDeviceRegInit, String> id;
	public static volatile SingularAttribute<UserDeviceRegInit, BigInteger> actionCompany;
	public static volatile SingularAttribute<UserDeviceRegInit, String> actionSource;
	public static volatile SingularAttribute<UserDeviceRegInit, BigInteger> actionTime;
	public static volatile SingularAttribute<UserDeviceRegInit, BigInteger> actionUser;
	public static volatile SingularAttribute<UserDeviceRegInit, BigInteger> adminId;
	public static volatile SingularAttribute<UserDeviceRegInit, String> authToken;
	public static volatile SingularAttribute<UserDeviceRegInit, Date> createDate;
	public static volatile SingularAttribute<UserDeviceRegInit, BigInteger> deviceTypeId_id;
	public static volatile SingularAttribute<UserDeviceRegInit, Integer> initType;
	public static volatile SingularAttribute<UserDeviceRegInit, String> name;
	public static volatile SingularAttribute<UserDeviceRegInit, BigInteger> ownerId;
	public static volatile SingularAttribute<UserDeviceRegInit, String> unqKey;
	public static volatile SingularAttribute<UserDeviceRegInit, Date> updateDate;
}
