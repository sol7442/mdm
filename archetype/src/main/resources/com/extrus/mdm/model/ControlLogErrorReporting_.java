package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.557+0900")
@StaticMetamodel(ControlLogErrorReporting.class)
public class ControlLogErrorReporting_ {
	public static volatile SingularAttribute<ControlLogErrorReporting, String> id;
	public static volatile SingularAttribute<ControlLogErrorReporting, BigInteger> actionCompany;
	public static volatile SingularAttribute<ControlLogErrorReporting, String> actionSource;
	public static volatile SingularAttribute<ControlLogErrorReporting, BigInteger> actionTime;
	public static volatile SingularAttribute<ControlLogErrorReporting, BigInteger> actionUser;
	public static volatile SingularAttribute<ControlLogErrorReporting, BigInteger> controlLog_id;
	public static volatile SingularAttribute<ControlLogErrorReporting, Date> createDate;
	public static volatile SingularAttribute<ControlLogErrorReporting, String> errorCode;
	public static volatile SingularAttribute<ControlLogErrorReporting, String> name;
	public static volatile SingularAttribute<ControlLogErrorReporting, Date> updateDate;
}
