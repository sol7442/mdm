package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.546+0900")
@StaticMetamodel(App.class)
public class App_ {
	public static volatile SingularAttribute<App, String> id;
	public static volatile SingularAttribute<App, BigInteger> actionCompany;
	public static volatile SingularAttribute<App, String> actionSource;
	public static volatile SingularAttribute<App, BigInteger> actionTime;
	public static volatile SingularAttribute<App, BigInteger> actionUser;
	public static volatile SingularAttribute<App, Integer> agentDeviceVendor;
	public static volatile SingularAttribute<App, Integer> appAgent;
	public static volatile SingularAttribute<App, Integer> appType;
	public static volatile SingularAttribute<App, BigInteger> certificateId;
	public static volatile SingularAttribute<App, BigInteger> companyId;
	public static volatile SingularAttribute<App, Date> createDate;
	public static volatile SingularAttribute<App, String> hash;
	public static volatile SingularAttribute<App, String> name;
	public static volatile SingularAttribute<App, String> packageName;
	public static volatile SingularAttribute<App, Date> updateDate;
	public static volatile SingularAttribute<App, Integer> virusResult;
	public static volatile SingularAttribute<App, Integer> windowsType;
}
