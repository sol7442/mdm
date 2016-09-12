package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.579+0900")
@StaticMetamodel(MdmPolicyModel.class)
public class MdmPolicyModel_ {
	public static volatile SingularAttribute<MdmPolicyModel, String> id;
	public static volatile SingularAttribute<MdmPolicyModel, BigInteger> actionCompany;
	public static volatile SingularAttribute<MdmPolicyModel, String> actionSource;
	public static volatile SingularAttribute<MdmPolicyModel, BigInteger> actionTime;
	public static volatile SingularAttribute<MdmPolicyModel, BigInteger> actionUser;
	public static volatile SingularAttribute<MdmPolicyModel, Integer> areaType;
	public static volatile SingularAttribute<MdmPolicyModel, Byte> baseFlag;
	public static volatile SingularAttribute<MdmPolicyModel, BigInteger> companyId;
	public static volatile SingularAttribute<MdmPolicyModel, Date> createDate;
	public static volatile SingularAttribute<MdmPolicyModel, String> name;
	public static volatile SingularAttribute<MdmPolicyModel, String> policyDesc;
	public static volatile SingularAttribute<MdmPolicyModel, Integer> policyType;
	public static volatile SingularAttribute<MdmPolicyModel, String> policyVersion;
	public static volatile SingularAttribute<MdmPolicyModel, Date> updateDate;
}
