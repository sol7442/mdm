package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.550+0900")
@StaticMetamodel(BackUp.class)
public class BackUp_ {
	public static volatile SingularAttribute<BackUp, String> id;
	public static volatile SingularAttribute<BackUp, BigInteger> actionCompany;
	public static volatile SingularAttribute<BackUp, String> actionSource;
	public static volatile SingularAttribute<BackUp, BigInteger> actionTime;
	public static volatile SingularAttribute<BackUp, BigInteger> actionUser;
	public static volatile SingularAttribute<BackUp, Date> createDate;
	public static volatile SingularAttribute<BackUp, BigInteger> dataId;
	public static volatile SingularAttribute<BackUp, String> name;
	public static volatile SingularAttribute<BackUp, Integer> type;
	public static volatile SingularAttribute<BackUp, Date> updateDate;
	public static volatile SingularAttribute<BackUp, BigInteger> userDevice_id;
}
