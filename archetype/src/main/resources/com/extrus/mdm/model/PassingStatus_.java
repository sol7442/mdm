package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.588+0900")
@StaticMetamodel(PassingStatus.class)
public class PassingStatus_ {
	public static volatile SingularAttribute<PassingStatus, String> id;
	public static volatile SingularAttribute<PassingStatus, BigInteger> actionCompany;
	public static volatile SingularAttribute<PassingStatus, String> actionSource;
	public static volatile SingularAttribute<PassingStatus, BigInteger> actionTime;
	public static volatile SingularAttribute<PassingStatus, BigInteger> actionUser;
	public static volatile SingularAttribute<PassingStatus, Integer> category;
	public static volatile SingularAttribute<PassingStatus, Date> createDate;
	public static volatile SingularAttribute<PassingStatus, String> name;
	public static volatile SingularAttribute<PassingStatus, BigInteger> policyId;
	public static volatile SingularAttribute<PassingStatus, Byte> signalStatus;
	public static volatile SingularAttribute<PassingStatus, Date> updateDate;
	public static volatile SingularAttribute<PassingStatus, BigInteger> userDevice_id;
}
