package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.599+0900")
@StaticMetamodel(UserDeviceInfoRegInit.class)
public class UserDeviceInfoRegInit_ {
	public static volatile SingularAttribute<UserDeviceInfoRegInit, String> id;
	public static volatile SingularAttribute<UserDeviceInfoRegInit, BigInteger> actionCompany;
	public static volatile SingularAttribute<UserDeviceInfoRegInit, String> actionSource;
	public static volatile SingularAttribute<UserDeviceInfoRegInit, BigInteger> actionTime;
	public static volatile SingularAttribute<UserDeviceInfoRegInit, BigInteger> actionUser;
	public static volatile SingularAttribute<UserDeviceInfoRegInit, String> appModuleId;
	public static volatile SingularAttribute<UserDeviceInfoRegInit, String> appVersion;
	public static volatile SingularAttribute<UserDeviceInfoRegInit, String> c2dmRid;
	public static volatile SingularAttribute<UserDeviceInfoRegInit, Date> createDate;
	public static volatile SingularAttribute<UserDeviceInfoRegInit, String> credential;
	public static volatile SingularAttribute<UserDeviceInfoRegInit, String> credentialType;
	public static volatile SingularAttribute<UserDeviceInfoRegInit, String> loginId;
	public static volatile SingularAttribute<UserDeviceInfoRegInit, String> modelName;
	public static volatile SingularAttribute<UserDeviceInfoRegInit, String> name;
	public static volatile SingularAttribute<UserDeviceInfoRegInit, String> osName;
	public static volatile SingularAttribute<UserDeviceInfoRegInit, String> osVersion;
	public static volatile SingularAttribute<UserDeviceInfoRegInit, String> phoneNumber;
	public static volatile SingularAttribute<UserDeviceInfoRegInit, String> policyVersion;
	public static volatile SingularAttribute<UserDeviceInfoRegInit, String> unqKey;
	public static volatile SingularAttribute<UserDeviceInfoRegInit, Date> updateDate;
}
