package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.586+0900")
@StaticMetamodel(NoticeTarget.class)
public class NoticeTarget_ {
	public static volatile SingularAttribute<NoticeTarget, String> id;
	public static volatile SingularAttribute<NoticeTarget, BigInteger> actionCompany;
	public static volatile SingularAttribute<NoticeTarget, String> actionSource;
	public static volatile SingularAttribute<NoticeTarget, BigInteger> actionTime;
	public static volatile SingularAttribute<NoticeTarget, BigInteger> actionUser;
	public static volatile SingularAttribute<NoticeTarget, Date> createDate;
	public static volatile SingularAttribute<NoticeTarget, String> name;
	public static volatile SingularAttribute<NoticeTarget, BigInteger> noticeId;
	public static volatile SingularAttribute<NoticeTarget, BigInteger> targetId;
	public static volatile SingularAttribute<NoticeTarget, Integer> targetType;
	public static volatile SingularAttribute<NoticeTarget, Date> updateDate;
}
