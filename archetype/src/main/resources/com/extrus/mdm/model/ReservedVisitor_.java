package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.592+0900")
@StaticMetamodel(ReservedVisitor.class)
public class ReservedVisitor_ {
	public static volatile SingularAttribute<ReservedVisitor, String> id;
	public static volatile SingularAttribute<ReservedVisitor, BigInteger> actionCompany;
	public static volatile SingularAttribute<ReservedVisitor, String> actionSource;
	public static volatile SingularAttribute<ReservedVisitor, BigInteger> actionTime;
	public static volatile SingularAttribute<ReservedVisitor, BigInteger> actionUser;
	public static volatile SingularAttribute<ReservedVisitor, String> authToken;
	public static volatile SingularAttribute<ReservedVisitor, BigInteger> companyId;
	public static volatile SingularAttribute<ReservedVisitor, String> companyName;
	public static volatile SingularAttribute<ReservedVisitor, Date> createDate;
	public static volatile SingularAttribute<ReservedVisitor, String> deptName;
	public static volatile SingularAttribute<ReservedVisitor, String> email;
	public static volatile SingularAttribute<ReservedVisitor, String> employeeCompany;
	public static volatile SingularAttribute<ReservedVisitor, String> employeeDeptName;
	public static volatile SingularAttribute<ReservedVisitor, String> employeeName;
	public static volatile SingularAttribute<ReservedVisitor, String> employeePosition;
	public static volatile SingularAttribute<ReservedVisitor, Integer> externalVisitNo;
	public static volatile SingularAttribute<ReservedVisitor, Integer> isVisiting;
	public static volatile SingularAttribute<ReservedVisitor, String> name;
	public static volatile SingularAttribute<ReservedVisitor, String> phoneNumber;
	public static volatile SingularAttribute<ReservedVisitor, String> position;
	public static volatile SingularAttribute<ReservedVisitor, Date> scheduledTime;
	public static volatile SingularAttribute<ReservedVisitor, Date> updateDate;
	public static volatile SingularAttribute<ReservedVisitor, BigInteger> visitorId;
	public static volatile SingularAttribute<ReservedVisitor, String> visitorDeptName;
	public static volatile SingularAttribute<ReservedVisitor, Integer> visitType;
}
