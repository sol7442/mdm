package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.585+0900")
@StaticMetamodel(Notice.class)
public class Notice_ {
	public static volatile SingularAttribute<Notice, String> id;
	public static volatile SingularAttribute<Notice, BigInteger> actionCompany;
	public static volatile SingularAttribute<Notice, String> actionSource;
	public static volatile SingularAttribute<Notice, BigInteger> actionTime;
	public static volatile SingularAttribute<Notice, BigInteger> actionUser;
	public static volatile SingularAttribute<Notice, BigInteger> companyId;
	public static volatile SingularAttribute<Notice, String> content;
	public static volatile SingularAttribute<Notice, Date> createDate;
	public static volatile SingularAttribute<Notice, BigInteger> creatorId;
	public static volatile SingularAttribute<Notice, String> endDate;
	public static volatile SingularAttribute<Notice, String> name;
	public static volatile SingularAttribute<Notice, String> startDate;
	public static volatile SingularAttribute<Notice, Integer> statusCode;
	public static volatile SingularAttribute<Notice, Date> updateDate;
}
