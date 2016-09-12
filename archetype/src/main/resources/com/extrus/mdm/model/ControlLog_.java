package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.554+0900")
@StaticMetamodel(ControlLog.class)
public class ControlLog_ {
	public static volatile SingularAttribute<ControlLog, String> id;
	public static volatile SingularAttribute<ControlLog, BigInteger> actionCompany;
	public static volatile SingularAttribute<ControlLog, String> actionSource;
	public static volatile SingularAttribute<ControlLog, BigInteger> actionTime;
	public static volatile SingularAttribute<ControlLog, BigInteger> actionUser;
	public static volatile SingularAttribute<ControlLog, Date> createDate;
	public static volatile SingularAttribute<ControlLog, String> errorMessage;
	public static volatile SingularAttribute<ControlLog, String> message;
	public static volatile SingularAttribute<ControlLog, String> name;
	public static volatile SingularAttribute<ControlLog, Integer> status;
	public static volatile SingularAttribute<ControlLog, Date> updateDate;
	public static volatile SingularAttribute<ControlLog, BigInteger> userId;
	public static volatile SingularAttribute<ControlLog, BigInteger> userDeviceId_id;
	public static volatile SingularAttribute<ControlLog, String> uuid;
}
