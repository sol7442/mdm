package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.550+0900")
@StaticMetamodel(BackUpData.class)
public class BackUpData_ {
	public static volatile SingularAttribute<BackUpData, String> id;
	public static volatile SingularAttribute<BackUpData, BigInteger> actionCompany;
	public static volatile SingularAttribute<BackUpData, String> actionSource;
	public static volatile SingularAttribute<BackUpData, BigInteger> actionTime;
	public static volatile SingularAttribute<BackUpData, BigInteger> actionUser;
	public static volatile SingularAttribute<BackUpData, String> backUpData;
	public static volatile SingularAttribute<BackUpData, Date> createDate;
	public static volatile SingularAttribute<BackUpData, String> name;
	public static volatile SingularAttribute<BackUpData, Date> updateDate;
	public static volatile SingularAttribute<BackUpData, BigInteger> userDevice_id;
}
