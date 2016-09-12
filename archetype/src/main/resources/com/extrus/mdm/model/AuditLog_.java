package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.548+0900")
@StaticMetamodel(AuditLog.class)
public class AuditLog_ {
	public static volatile SingularAttribute<AuditLog, String> id;
	public static volatile SingularAttribute<AuditLog, BigInteger> actionCompany;
	public static volatile SingularAttribute<AuditLog, String> actionSource;
	public static volatile SingularAttribute<AuditLog, BigInteger> actionTime;
	public static volatile SingularAttribute<AuditLog, BigInteger> actionUser;
	public static volatile SingularAttribute<AuditLog, Date> createDate;
	public static volatile SingularAttribute<AuditLog, String> difference;
	public static volatile SingularAttribute<AuditLog, String> differenceView;
	public static volatile SingularAttribute<AuditLog, String> entityName;
	public static volatile SingularAttribute<AuditLog, String> name;
	public static volatile SingularAttribute<AuditLog, Integer> operation;
	public static volatile SingularAttribute<AuditLog, String> originalEntity;
	public static volatile SingularAttribute<AuditLog, String> originalEntityView;
	public static volatile SingularAttribute<AuditLog, String> sourceIp;
	public static volatile SingularAttribute<AuditLog, Date> updateDate;
	public static volatile SingularAttribute<AuditLog, BigInteger> whoId;
}
