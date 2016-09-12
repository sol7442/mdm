package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.574+0900")
@StaticMetamodel(MdmLogStastic.class)
public class MdmLogStastic_ {
	public static volatile SingularAttribute<MdmLogStastic, String> id;
	public static volatile SingularAttribute<MdmLogStastic, BigInteger> actionCompany;
	public static volatile SingularAttribute<MdmLogStastic, String> actionSource;
	public static volatile SingularAttribute<MdmLogStastic, BigInteger> actionTime;
	public static volatile SingularAttribute<MdmLogStastic, BigInteger> actionUser;
	public static volatile SingularAttribute<MdmLogStastic, BigInteger> companyId;
	public static volatile SingularAttribute<MdmLogStastic, Date> createDate;
	public static volatile SingularAttribute<MdmLogStastic, Integer> logCount;
	public static volatile SingularAttribute<MdmLogStastic, String> logDate;
	public static volatile SingularAttribute<MdmLogStastic, Integer> logType;
	public static volatile SingularAttribute<MdmLogStastic, String> name;
	public static volatile SingularAttribute<MdmLogStastic, Integer> severity;
	public static volatile SingularAttribute<MdmLogStastic, Date> updateDate;
}
