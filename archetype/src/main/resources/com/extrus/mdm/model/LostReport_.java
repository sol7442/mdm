package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.571+0900")
@StaticMetamodel(LostReport.class)
public class LostReport_ {
	public static volatile SingularAttribute<LostReport, String> id;
	public static volatile SingularAttribute<LostReport, BigInteger> actionCompany;
	public static volatile SingularAttribute<LostReport, String> actionSource;
	public static volatile SingularAttribute<LostReport, BigInteger> actionTime;
	public static volatile SingularAttribute<LostReport, BigInteger> actionUser;
	public static volatile SingularAttribute<LostReport, Date> createDate;
	public static volatile SingularAttribute<LostReport, Integer> isCallLock;
	public static volatile SingularAttribute<LostReport, Integer> isDeletedData;
	public static volatile SingularAttribute<LostReport, Integer> isLocation;
	public static volatile SingularAttribute<LostReport, Integer> isLocked;
	public static volatile SingularAttribute<LostReport, Integer> isResetPasswd;
	public static volatile SingularAttribute<LostReport, Integer> isTraceCall;
	public static volatile SingularAttribute<LostReport, Integer> isWipe;
	public static volatile SingularAttribute<LostReport, String> name;
	public static volatile SingularAttribute<LostReport, Integer> statusCode;
	public static volatile SingularAttribute<LostReport, Date> updateDate;
	public static volatile SingularAttribute<LostReport, BigInteger> userDeviceId_id;
}
