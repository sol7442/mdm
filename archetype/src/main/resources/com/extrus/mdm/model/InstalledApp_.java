package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.568+0900")
@StaticMetamodel(InstalledApp.class)
public class InstalledApp_ {
	public static volatile SingularAttribute<InstalledApp, String> id;
	public static volatile SingularAttribute<InstalledApp, BigInteger> actionCompany;
	public static volatile SingularAttribute<InstalledApp, String> actionSource;
	public static volatile SingularAttribute<InstalledApp, BigInteger> actionTime;
	public static volatile SingularAttribute<InstalledApp, BigInteger> actionUser;
	public static volatile SingularAttribute<InstalledApp, BigInteger> appId;
	public static volatile SingularAttribute<InstalledApp, String> appSize;
	public static volatile SingularAttribute<InstalledApp, Date> createDate;
	public static volatile SingularAttribute<InstalledApp, String> dataSize;
	public static volatile SingularAttribute<InstalledApp, BigInteger> deviceId;
	public static volatile SingularAttribute<InstalledApp, Byte> hasDeletedApp;
	public static volatile SingularAttribute<InstalledApp, String> installedDate;
	public static volatile SingularAttribute<InstalledApp, String> installedVersion;
	public static volatile SingularAttribute<InstalledApp, String> name;
	public static volatile SingularAttribute<InstalledApp, String> publisher;
	public static volatile SingularAttribute<InstalledApp, Date> updateDate;
}
