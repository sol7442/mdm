package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.571+0900")
@StaticMetamodel(LostHistory.class)
public class LostHistory_ {
	public static volatile SingularAttribute<LostHistory, String> id;
	public static volatile SingularAttribute<LostHistory, BigInteger> actionCompany;
	public static volatile SingularAttribute<LostHistory, String> actionSource;
	public static volatile SingularAttribute<LostHistory, BigInteger> actionTime;
	public static volatile SingularAttribute<LostHistory, BigInteger> actionUser;
	public static volatile SingularAttribute<LostHistory, String> commant;
	public static volatile SingularAttribute<LostHistory, Date> createDate;
	public static volatile SingularAttribute<LostHistory, String> name;
	public static volatile SingularAttribute<LostHistory, BigInteger> reporterId;
	public static volatile SingularAttribute<LostHistory, Integer> type;
	public static volatile SingularAttribute<LostHistory, Date> updateDate;
	public static volatile SingularAttribute<LostHistory, BigInteger> userDevice_id;
}
