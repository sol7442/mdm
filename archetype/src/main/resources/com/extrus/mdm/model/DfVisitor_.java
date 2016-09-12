package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.561+0900")
@StaticMetamodel(DfVisitor.class)
public class DfVisitor_ {
	public static volatile SingularAttribute<DfVisitor, String> id;
	public static volatile SingularAttribute<DfVisitor, BigInteger> actionCompany;
	public static volatile SingularAttribute<DfVisitor, String> actionSource;
	public static volatile SingularAttribute<DfVisitor, BigInteger> actionTime;
	public static volatile SingularAttribute<DfVisitor, BigInteger> actionUser;
	public static volatile SingularAttribute<DfVisitor, String> companyName;
	public static volatile SingularAttribute<DfVisitor, Integer> complete;
	public static volatile SingularAttribute<DfVisitor, Date> createDate;
	public static volatile SingularAttribute<DfVisitor, String> deptName;
	public static volatile SingularAttribute<DfVisitor, BigInteger> deviceId;
	public static volatile SingularAttribute<DfVisitor, String> email;
	public static volatile SingularAttribute<DfVisitor, String> employeeCompany;
	public static volatile SingularAttribute<DfVisitor, String> employeeDeptName;
	public static volatile SingularAttribute<DfVisitor, String> employeeName;
	public static volatile SingularAttribute<DfVisitor, String> employeePosition;
	public static volatile SingularAttribute<DfVisitor, Integer> externalVisitNo;
	public static volatile SingularAttribute<DfVisitor, String> name;
	public static volatile SingularAttribute<DfVisitor, BigInteger> policyId;
	public static volatile SingularAttribute<DfVisitor, String> position;
	public static volatile SingularAttribute<DfVisitor, Date> scheduledTime;
	public static volatile SingularAttribute<DfVisitor, Date> updateDate;
	public static volatile SingularAttribute<DfVisitor, Integer> visitorActionType;
	public static volatile SingularAttribute<DfVisitor, String> visitorDeptName;
	public static volatile SingularAttribute<DfVisitor, Integer> visitorType;
}
