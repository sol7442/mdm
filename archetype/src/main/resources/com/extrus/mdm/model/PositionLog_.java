package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.589+0900")
@StaticMetamodel(PositionLog.class)
public class PositionLog_ {
	public static volatile SingularAttribute<PositionLog, String> id;
	public static volatile SingularAttribute<PositionLog, BigInteger> actionCompany;
	public static volatile SingularAttribute<PositionLog, String> actionSource;
	public static volatile SingularAttribute<PositionLog, BigInteger> actionTime;
	public static volatile SingularAttribute<PositionLog, BigInteger> actionUser;
	public static volatile SingularAttribute<PositionLog, String> address;
	public static volatile SingularAttribute<PositionLog, String> altitude;
	public static volatile SingularAttribute<PositionLog, Date> createDate;
	public static volatile SingularAttribute<PositionLog, String> latitude;
	public static volatile SingularAttribute<PositionLog, String> longitude;
	public static volatile SingularAttribute<PositionLog, String> name;
	public static volatile SingularAttribute<PositionLog, Date> updateDate;
	public static volatile SingularAttribute<PositionLog, BigInteger> userDevice_id;
}
