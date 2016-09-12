package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.552+0900")
@StaticMetamodel(ControlAP.class)
public class ControlAP_ {
	public static volatile SingularAttribute<ControlAP, String> id;
	public static volatile SingularAttribute<ControlAP, BigInteger> actionCompany;
	public static volatile SingularAttribute<ControlAP, String> actionSource;
	public static volatile SingularAttribute<ControlAP, BigInteger> actionTime;
	public static volatile SingularAttribute<ControlAP, BigInteger> actionUser;
	public static volatile SingularAttribute<ControlAP, String> apDesc;
	public static volatile SingularAttribute<ControlAP, String> auth;
	public static volatile SingularAttribute<ControlAP, String> bsID;
	public static volatile SingularAttribute<ControlAP, BigInteger> companyId;
	public static volatile SingularAttribute<ControlAP, Date> createDate;
	public static volatile SingularAttribute<ControlAP, String> name;
	public static volatile SingularAttribute<ControlAP, String> pin;
	public static volatile SingularAttribute<ControlAP, String> ssID;
	public static volatile SingularAttribute<ControlAP, Date> updateDate;
}
