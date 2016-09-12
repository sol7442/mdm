package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.598+0900")
@StaticMetamodel(UserDevice.class)
public class UserDevice_ {
	public static volatile SingularAttribute<UserDevice, String> id;
	public static volatile SingularAttribute<UserDevice, BigInteger> actionCompany;
	public static volatile SingularAttribute<UserDevice, String> actionSource;
	public static volatile SingularAttribute<UserDevice, BigInteger> actionTime;
	public static volatile SingularAttribute<UserDevice, BigInteger> actionUser;
	public static volatile SingularAttribute<UserDevice, BigInteger> adminId;
	public static volatile SingularAttribute<UserDevice, String> agentId;
	public static volatile SingularAttribute<UserDevice, Byte> allowedLocationMonitoring;
	public static volatile SingularAttribute<UserDevice, String> authToken;
	public static volatile SingularAttribute<UserDevice, String> commonPolicyVer;
	public static volatile SingularAttribute<UserDevice, Date> createDate;
	public static volatile SingularAttribute<UserDevice, BigInteger> deviceTypeId_id;
	public static volatile SingularAttribute<UserDevice, String> extCode;
	public static volatile SingularAttribute<UserDevice, Date> heartbeatDateTime;
	public static volatile SingularAttribute<UserDevice, String> imeiVal;
	public static volatile SingularAttribute<UserDevice, Byte> isLastVersion;
	public static volatile SingularAttribute<UserDevice, Byte> isLock;
	public static volatile SingularAttribute<UserDevice, Byte> isModuleInstalled;
	public static volatile SingularAttribute<UserDevice, Byte> isRegistered;
	public static volatile SingularAttribute<UserDevice, Byte> isRooted;
	public static volatile SingularAttribute<UserDevice, Byte> isVendorPushEnabled;
	public static volatile SingularAttribute<UserDevice, Date> lastAccessTime;
	public static volatile SingularAttribute<UserDevice, BigInteger> lastPolicyApplied_id;
	public static volatile SingularAttribute<UserDevice, Date> lastSyncTime;
	public static volatile SingularAttribute<UserDevice, String> lockCnt;
	public static volatile SingularAttribute<UserDevice, Integer> lost;
	public static volatile SingularAttribute<UserDevice, Date> lostTime;
	public static volatile SingularAttribute<UserDevice, String> mobileNumber;
	public static volatile SingularAttribute<UserDevice, String> name;
	public static volatile SingularAttribute<UserDevice, BigInteger> nowPolicy_id;
	public static volatile SingularAttribute<UserDevice, String> nowPolicyControl;
	public static volatile SingularAttribute<UserDevice, BigInteger> ownerId;
	public static volatile SingularAttribute<UserDevice, String> pushId;
	public static volatile SingularAttribute<UserDevice, Integer> reConnectCount;
	public static volatile SingularAttribute<UserDevice, String> statusCode;
	public static volatile SingularAttribute<UserDevice, String> unlockToken;
	public static volatile SingularAttribute<UserDevice, String> unqKey;
	public static volatile SingularAttribute<UserDevice, Date> unRegisteredDate;
	public static volatile SingularAttribute<UserDevice, Date> updateDate;
	public static volatile SingularAttribute<UserDevice, Integer> vendor;
}
