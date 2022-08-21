package com.technoplus.cambio.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Rates implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@JsonProperty("USD") 
    public int uSD;
    @JsonProperty("AED") 
    public double aED;
    @JsonProperty("AFN") 
    public double aFN;
    @JsonProperty("ALL") 
    // Alterei de aLL para WLL, pois, aLL é uma palavra reservada de JPA
    public double WLL;
    @JsonProperty("AMD") 
    public double aMD;
    @JsonProperty("ANG") 
    public double aNG;
    @JsonProperty("AOA") 
    public double aOA;
    @JsonProperty("ARS") 
    public double aRS;
    @JsonProperty("AUD") 
    public double aUD;
    @JsonProperty("AWG") 
    public double aWG;
    @JsonProperty("AZN") 
    public double aZN;
    @JsonProperty("BAM") 
    public double bAM;
    @JsonProperty("BBD") 
    public int bBD;
    @JsonProperty("BDT") 
    public double bDT;
    @JsonProperty("BGN") 
    public double bGN;
    @JsonProperty("BHD") 
    public double bHD;
    @JsonProperty("BIF") 
    public double bIF;
    @JsonProperty("BMD") 
    public int bMD;
    @JsonProperty("BND") 
    public double bND;
    @JsonProperty("BOB") 
    public double bOB;
    @JsonProperty("BRL") 
    public double bRL;
    @JsonProperty("BSD") 
    public int bSD;
    @JsonProperty("BTN") 
    public double bTN;
    @JsonProperty("BWP") 
    public double bWP;
    @JsonProperty("BYN") 
    public double bYN;
    @JsonProperty("BZD") 
    public int bZD;
    @JsonProperty("CAD") 
    public double cAD;
    @JsonProperty("CDF") 
    public double cDF;
    @JsonProperty("CHF") 
    public double cHF;
    @JsonProperty("CLP") 
    public double cLP;
    @JsonProperty("CNY") 
    public double cNY;
    @JsonProperty("COP") 
    public double cOP;
    @JsonProperty("CRC") 
    public double cRC;
    @JsonProperty("CUP") 
    public int cUP;
    @JsonProperty("CVE") 
    public double cVE;
    @JsonProperty("CZK") 
    public double cZK;
    @JsonProperty("DJF") 
    public double dJF;
    @JsonProperty("DKK") 
    public double dKK;
    @JsonProperty("DOP") 
    public double dOP;
    @JsonProperty("DZD") 
    public double dZD;
    @JsonProperty("EGP") 
    public double eGP;
    @JsonProperty("ERN") 
    public int eRN;
    @JsonProperty("ETB") 
    public double eTB;
    @JsonProperty("EUR") 
    public double eUR;
    @JsonProperty("FJD") 
    public double fJD;
    @JsonProperty("FKP") 
    public double fKP;
    @JsonProperty("FOK") 
    public double fOK;
    @JsonProperty("GBP") 
    public double gBP;
    @JsonProperty("GEL") 
    public double gEL;
    @JsonProperty("GGP") 
    public double gGP;
    @JsonProperty("GHS") 
    public double gHS;
    @JsonProperty("GIP") 
    public double gIP;
    @JsonProperty("GMD") 
    public double gMD;
    @JsonProperty("GNF") 
    public double gNF;
    @JsonProperty("GTQ") 
    public double gTQ;
    @JsonProperty("GYD") 
    public double gYD;
    @JsonProperty("HKD") 
    public double hKD;
    @JsonProperty("HNL") 
    public double hNL;
    @JsonProperty("HRK") 
    public double hRK;
    @JsonProperty("HTG") 
    public double hTG;
    @JsonProperty("HUF") 
    public double hUF;
    @JsonProperty("IDR") 
    public double iDR;
    @JsonProperty("ILS") 
    public double iLS;
    @JsonProperty("IMP") 
    public double iMP;
    @JsonProperty("INR") 
    public double iNR;
    @JsonProperty("IQD") 
    public double iQD;
    @JsonProperty("IRR") 
    public double iRR;
    @JsonProperty("ISK") 
    public double iSK;
    @JsonProperty("JEP") 
    public double jEP;
    @JsonProperty("JMD") 
    public double jMD;
    @JsonProperty("JOD") 
    public double jOD;
    @JsonProperty("JPY") 
    public double jPY;
    @JsonProperty("KES") 
    public double kES;
    @JsonProperty("KGS") 
    public double kGS;
    @JsonProperty("KHR") 
    public double kHR;
    @JsonProperty("KID") 
    public double kID;
    @JsonProperty("KMF") 
    public double kMF;
    @JsonProperty("KRW") 
    public double kRW;
    @JsonProperty("KWD") 
    public double kWD;
    @JsonProperty("KYD") 
    public double kYD;
    @JsonProperty("KZT") 
    public double kZT;
    @JsonProperty("LAK") 
    public double lAK;
    @JsonProperty("LBP") 
    public double lBP;
    @JsonProperty("LKR") 
    public double lKR;
    @JsonProperty("LRD") 
    public double lRD;
    @JsonProperty("LSL") 
    public double lSL;
    @JsonProperty("LYD") 
    public double lYD;
    @JsonProperty("MAD") 
    public double mAD;
    @JsonProperty("MDL") 
    public double mDL;
    @JsonProperty("MGA") 
    public double mGA;
    @JsonProperty("MKD") 
    public double mKD;
    @JsonProperty("MMK") 
    public double mMK;
    @JsonProperty("MNT") 
    public double mNT;
    @JsonProperty("MOP") 
    public double mOP;
    @JsonProperty("MRU") 
    public double mRU;
    @JsonProperty("MUR") 
    public double mUR;
    @JsonProperty("MVR") 
    public double mVR;
    @JsonProperty("MWK") 
    public double mWK;
    @JsonProperty("MXN") 
    public double mXN;
    @JsonProperty("MYR") 
    public double mYR;
    @JsonProperty("MZN") 
    public double mZN;
    @JsonProperty("NAD") 
    public double nAD;
    @JsonProperty("NGN") 
    public double nGN;
    @JsonProperty("NIO") 
    public double nIO;
    @JsonProperty("NOK") 
    public double nOK;
    @JsonProperty("NPR") 
    public double nPR;
    @JsonProperty("NZD") 
    public double nZD;
    @JsonProperty("OMR") 
    public double oMR;
    @JsonProperty("PAB") 
    public int pAB;
    @JsonProperty("PEN") 
    public double pEN;
    @JsonProperty("PGK") 
    public double pGK;
    @JsonProperty("PHP") 
    public double pHP;
    @JsonProperty("PKR") 
    public double pKR;
    @JsonProperty("PLN") 
    public double pLN;
    @JsonProperty("PYG") 
    public double pYG;
    @JsonProperty("QAR") 
    public double qAR;
    @JsonProperty("RON") 
    public double rON;
    @JsonProperty("RSD") 
    public double rSD;
    @JsonProperty("RUB") 
    public double rUB;
    @JsonProperty("RWF") 
    public double rWF;
    @JsonProperty("SAR") 
    public double sAR;
    @JsonProperty("SBD") 
    public double sBD;
    @JsonProperty("SCR") 
    public double sCR;
    @JsonProperty("SDG") 
    public double sDG;
    @JsonProperty("SEK") 
    public double sEK;
    @JsonProperty("SGD") 
    public double sGD;
    @JsonProperty("SHP") 
    public double sHP;
    @JsonProperty("SLE") 
    public double sLE;
    @JsonProperty("SLL") 
    public double sLL;
    @JsonProperty("SOS") 
    public double sOS;
    @JsonProperty("SRD") 
    public double sRD;
    @JsonProperty("SSP") 
    public double sSP;
    @JsonProperty("STN") 
    public double sTN;
    @JsonProperty("SYP") 
    public double sYP;
    @JsonProperty("SZL") 
    public double sZL;
    @JsonProperty("THB") 
    public double tHB;
    @JsonProperty("TJS") 
    public double tJS;
    @JsonProperty("TMT") 
    public double tMT;
    @JsonProperty("TND") 
    public double tND;
    @JsonProperty("TOP") 
    public double tOP;
    @JsonProperty("TRY") 
    public double tRY;
    @JsonProperty("TTD") 
    public double tTD;
    @JsonProperty("TVD") 
    public double tVD;
    @JsonProperty("TWD") 
    public double tWD;
    @JsonProperty("TZS") 
    public double tZS;
    @JsonProperty("UAH") 
    public double uAH;
    @JsonProperty("UGX") 
    public double uGX;
    @JsonProperty("UYU") 
    public double uYU;
    @JsonProperty("UZS") 
    public double uZS;
    @JsonProperty("VES") 
    public double vES;
    @JsonProperty("VND") 
    public double vND;
    @JsonProperty("VUV") 
    public double vUV;
    @JsonProperty("WST") 
    public double wST;
    @JsonProperty("XAF") 
    public double xAF;
    @JsonProperty("XCD") 
    public double xCD;
    @JsonProperty("XDR") 
    public double xDR;
    @JsonProperty("XOF") 
    public double xOF;
    @JsonProperty("XPF") 
    public double xPF;
    @JsonProperty("YER") 
    public double yER;
    @JsonProperty("ZAR") 
    public double zAR;
    @JsonProperty("ZMW") 
    public double zMW;
    @JsonProperty("ZWL") 
    public double zWL;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getuSD() {
		return uSD;
	}
	public void setuSD(int uSD) {
		this.uSD = uSD;
	}
	public double getaED() {
		return aED;
	}
	public void setaED(double aED) {
		this.aED = aED;
	}
	public double getaFN() {
		return aFN;
	}
	public void setaFN(double aFN) {
		this.aFN = aFN;
	}
	public double getWLL() {
		return WLL;
	}
	public void setWLL(double wLL) {
		WLL = wLL;
	}
	public double getaMD() {
		return aMD;
	}
	public void setaMD(double aMD) {
		this.aMD = aMD;
	}
	public double getaNG() {
		return aNG;
	}
	public void setaNG(double aNG) {
		this.aNG = aNG;
	}
	public double getaOA() {
		return aOA;
	}
	public void setaOA(double aOA) {
		this.aOA = aOA;
	}
	public double getaRS() {
		return aRS;
	}
	public void setaRS(double aRS) {
		this.aRS = aRS;
	}
	public double getaUD() {
		return aUD;
	}
	public void setaUD(double aUD) {
		this.aUD = aUD;
	}
	public double getaWG() {
		return aWG;
	}
	public void setaWG(double aWG) {
		this.aWG = aWG;
	}
	public double getaZN() {
		return aZN;
	}
	public void setaZN(double aZN) {
		this.aZN = aZN;
	}
	public double getbAM() {
		return bAM;
	}
	public void setbAM(double bAM) {
		this.bAM = bAM;
	}
	public int getbBD() {
		return bBD;
	}
	public void setbBD(int bBD) {
		this.bBD = bBD;
	}
	public double getbDT() {
		return bDT;
	}
	public void setbDT(double bDT) {
		this.bDT = bDT;
	}
	public double getbGN() {
		return bGN;
	}
	public void setbGN(double bGN) {
		this.bGN = bGN;
	}
	public double getbHD() {
		return bHD;
	}
	public void setbHD(double bHD) {
		this.bHD = bHD;
	}
	public double getbIF() {
		return bIF;
	}
	public void setbIF(double bIF) {
		this.bIF = bIF;
	}
	public int getbMD() {
		return bMD;
	}
	public void setbMD(int bMD) {
		this.bMD = bMD;
	}
	public double getbND() {
		return bND;
	}
	public void setbND(double bND) {
		this.bND = bND;
	}
	public double getbOB() {
		return bOB;
	}
	public void setbOB(double bOB) {
		this.bOB = bOB;
	}
	public double getbRL() {
		return bRL;
	}
	public void setbRL(double bRL) {
		this.bRL = bRL;
	}
	public int getbSD() {
		return bSD;
	}
	public void setbSD(int bSD) {
		this.bSD = bSD;
	}
	public double getbTN() {
		return bTN;
	}
	public void setbTN(double bTN) {
		this.bTN = bTN;
	}
	public double getbWP() {
		return bWP;
	}
	public void setbWP(double bWP) {
		this.bWP = bWP;
	}
	public double getbYN() {
		return bYN;
	}
	public void setbYN(double bYN) {
		this.bYN = bYN;
	}
	public int getbZD() {
		return bZD;
	}
	public void setbZD(int bZD) {
		this.bZD = bZD;
	}
	public double getcAD() {
		return cAD;
	}
	public void setcAD(double cAD) {
		this.cAD = cAD;
	}
	public double getcDF() {
		return cDF;
	}
	public void setcDF(double cDF) {
		this.cDF = cDF;
	}
	public double getcHF() {
		return cHF;
	}
	public void setcHF(double cHF) {
		this.cHF = cHF;
	}
	public double getcLP() {
		return cLP;
	}
	public void setcLP(double cLP) {
		this.cLP = cLP;
	}
	public double getcNY() {
		return cNY;
	}
	public void setcNY(double cNY) {
		this.cNY = cNY;
	}
	public double getcOP() {
		return cOP;
	}
	public void setcOP(double cOP) {
		this.cOP = cOP;
	}
	public double getcRC() {
		return cRC;
	}
	public void setcRC(double cRC) {
		this.cRC = cRC;
	}
	public int getcUP() {
		return cUP;
	}
	public void setcUP(int cUP) {
		this.cUP = cUP;
	}
	public double getcVE() {
		return cVE;
	}
	public void setcVE(double cVE) {
		this.cVE = cVE;
	}
	public double getcZK() {
		return cZK;
	}
	public void setcZK(double cZK) {
		this.cZK = cZK;
	}
	public double getdJF() {
		return dJF;
	}
	public void setdJF(double dJF) {
		this.dJF = dJF;
	}
	public double getdKK() {
		return dKK;
	}
	public void setdKK(double dKK) {
		this.dKK = dKK;
	}
	public double getdOP() {
		return dOP;
	}
	public void setdOP(double dOP) {
		this.dOP = dOP;
	}
	public double getdZD() {
		return dZD;
	}
	public void setdZD(double dZD) {
		this.dZD = dZD;
	}
	public double geteGP() {
		return eGP;
	}
	public void seteGP(double eGP) {
		this.eGP = eGP;
	}
	public int geteRN() {
		return eRN;
	}
	public void seteRN(int eRN) {
		this.eRN = eRN;
	}
	public double geteTB() {
		return eTB;
	}
	public void seteTB(double eTB) {
		this.eTB = eTB;
	}
	public double geteUR() {
		return eUR;
	}
	public void seteUR(double eUR) {
		this.eUR = eUR;
	}
	public double getfJD() {
		return fJD;
	}
	public void setfJD(double fJD) {
		this.fJD = fJD;
	}
	public double getfKP() {
		return fKP;
	}
	public void setfKP(double fKP) {
		this.fKP = fKP;
	}
	public double getfOK() {
		return fOK;
	}
	public void setfOK(double fOK) {
		this.fOK = fOK;
	}
	public double getgBP() {
		return gBP;
	}
	public void setgBP(double gBP) {
		this.gBP = gBP;
	}
	public double getgEL() {
		return gEL;
	}
	public void setgEL(double gEL) {
		this.gEL = gEL;
	}
	public double getgGP() {
		return gGP;
	}
	public void setgGP(double gGP) {
		this.gGP = gGP;
	}
	public double getgHS() {
		return gHS;
	}
	public void setgHS(double gHS) {
		this.gHS = gHS;
	}
	public double getgIP() {
		return gIP;
	}
	public void setgIP(double gIP) {
		this.gIP = gIP;
	}
	public double getgMD() {
		return gMD;
	}
	public void setgMD(double gMD) {
		this.gMD = gMD;
	}
	public double getgNF() {
		return gNF;
	}
	public void setgNF(double gNF) {
		this.gNF = gNF;
	}
	public double getgTQ() {
		return gTQ;
	}
	public void setgTQ(double gTQ) {
		this.gTQ = gTQ;
	}
	public double getgYD() {
		return gYD;
	}
	public void setgYD(double gYD) {
		this.gYD = gYD;
	}
	public double gethKD() {
		return hKD;
	}
	public void sethKD(double hKD) {
		this.hKD = hKD;
	}
	public double gethNL() {
		return hNL;
	}
	public void sethNL(double hNL) {
		this.hNL = hNL;
	}
	public double gethRK() {
		return hRK;
	}
	public void sethRK(double hRK) {
		this.hRK = hRK;
	}
	public double gethTG() {
		return hTG;
	}
	public void sethTG(double hTG) {
		this.hTG = hTG;
	}
	public double gethUF() {
		return hUF;
	}
	public void sethUF(double hUF) {
		this.hUF = hUF;
	}
	public double getiDR() {
		return iDR;
	}
	public void setiDR(double iDR) {
		this.iDR = iDR;
	}
	public double getiLS() {
		return iLS;
	}
	public void setiLS(double iLS) {
		this.iLS = iLS;
	}
	public double getiMP() {
		return iMP;
	}
	public void setiMP(double iMP) {
		this.iMP = iMP;
	}
	public double getiNR() {
		return iNR;
	}
	public void setiNR(double iNR) {
		this.iNR = iNR;
	}
	public double getiQD() {
		return iQD;
	}
	public void setiQD(double iQD) {
		this.iQD = iQD;
	}
	public double getiRR() {
		return iRR;
	}
	public void setiRR(double iRR) {
		this.iRR = iRR;
	}
	public double getiSK() {
		return iSK;
	}
	public void setiSK(double iSK) {
		this.iSK = iSK;
	}
	public double getjEP() {
		return jEP;
	}
	public void setjEP(double jEP) {
		this.jEP = jEP;
	}
	public double getjMD() {
		return jMD;
	}
	public void setjMD(double jMD) {
		this.jMD = jMD;
	}
	public double getjOD() {
		return jOD;
	}
	public void setjOD(double jOD) {
		this.jOD = jOD;
	}
	public double getjPY() {
		return jPY;
	}
	public void setjPY(double jPY) {
		this.jPY = jPY;
	}
	public double getkES() {
		return kES;
	}
	public void setkES(double kES) {
		this.kES = kES;
	}
	public double getkGS() {
		return kGS;
	}
	public void setkGS(double kGS) {
		this.kGS = kGS;
	}
	public double getkHR() {
		return kHR;
	}
	public void setkHR(double kHR) {
		this.kHR = kHR;
	}
	public double getkID() {
		return kID;
	}
	public void setkID(double kID) {
		this.kID = kID;
	}
	public double getkMF() {
		return kMF;
	}
	public void setkMF(double kMF) {
		this.kMF = kMF;
	}
	public double getkRW() {
		return kRW;
	}
	public void setkRW(double kRW) {
		this.kRW = kRW;
	}
	public double getkWD() {
		return kWD;
	}
	public void setkWD(double kWD) {
		this.kWD = kWD;
	}
	public double getkYD() {
		return kYD;
	}
	public void setkYD(double kYD) {
		this.kYD = kYD;
	}
	public double getkZT() {
		return kZT;
	}
	public void setkZT(double kZT) {
		this.kZT = kZT;
	}
	public double getlAK() {
		return lAK;
	}
	public void setlAK(double lAK) {
		this.lAK = lAK;
	}
	public double getlBP() {
		return lBP;
	}
	public void setlBP(double lBP) {
		this.lBP = lBP;
	}
	public double getlKR() {
		return lKR;
	}
	public void setlKR(double lKR) {
		this.lKR = lKR;
	}
	public double getlRD() {
		return lRD;
	}
	public void setlRD(double lRD) {
		this.lRD = lRD;
	}
	public double getlSL() {
		return lSL;
	}
	public void setlSL(double lSL) {
		this.lSL = lSL;
	}
	public double getlYD() {
		return lYD;
	}
	public void setlYD(double lYD) {
		this.lYD = lYD;
	}
	public double getmAD() {
		return mAD;
	}
	public void setmAD(double mAD) {
		this.mAD = mAD;
	}
	public double getmDL() {
		return mDL;
	}
	public void setmDL(double mDL) {
		this.mDL = mDL;
	}
	public double getmGA() {
		return mGA;
	}
	public void setmGA(double mGA) {
		this.mGA = mGA;
	}
	public double getmKD() {
		return mKD;
	}
	public void setmKD(double mKD) {
		this.mKD = mKD;
	}
	public double getmMK() {
		return mMK;
	}
	public void setmMK(double mMK) {
		this.mMK = mMK;
	}
	public double getmNT() {
		return mNT;
	}
	public void setmNT(double mNT) {
		this.mNT = mNT;
	}
	public double getmOP() {
		return mOP;
	}
	public void setmOP(double mOP) {
		this.mOP = mOP;
	}
	public double getmRU() {
		return mRU;
	}
	public void setmRU(double mRU) {
		this.mRU = mRU;
	}
	public double getmUR() {
		return mUR;
	}
	public void setmUR(double mUR) {
		this.mUR = mUR;
	}
	public double getmVR() {
		return mVR;
	}
	public void setmVR(double mVR) {
		this.mVR = mVR;
	}
	public double getmWK() {
		return mWK;
	}
	public void setmWK(double mWK) {
		this.mWK = mWK;
	}
	public double getmXN() {
		return mXN;
	}
	public void setmXN(double mXN) {
		this.mXN = mXN;
	}
	public double getmYR() {
		return mYR;
	}
	public void setmYR(double mYR) {
		this.mYR = mYR;
	}
	public double getmZN() {
		return mZN;
	}
	public void setmZN(double mZN) {
		this.mZN = mZN;
	}
	public double getnAD() {
		return nAD;
	}
	public void setnAD(double nAD) {
		this.nAD = nAD;
	}
	public double getnGN() {
		return nGN;
	}
	public void setnGN(double nGN) {
		this.nGN = nGN;
	}
	public double getnIO() {
		return nIO;
	}
	public void setnIO(double nIO) {
		this.nIO = nIO;
	}
	public double getnOK() {
		return nOK;
	}
	public void setnOK(double nOK) {
		this.nOK = nOK;
	}
	public double getnPR() {
		return nPR;
	}
	public void setnPR(double nPR) {
		this.nPR = nPR;
	}
	public double getnZD() {
		return nZD;
	}
	public void setnZD(double nZD) {
		this.nZD = nZD;
	}
	public double getoMR() {
		return oMR;
	}
	public void setoMR(double oMR) {
		this.oMR = oMR;
	}
	public int getpAB() {
		return pAB;
	}
	public void setpAB(int pAB) {
		this.pAB = pAB;
	}
	public double getpEN() {
		return pEN;
	}
	public void setpEN(double pEN) {
		this.pEN = pEN;
	}
	public double getpGK() {
		return pGK;
	}
	public void setpGK(double pGK) {
		this.pGK = pGK;
	}
	public double getpHP() {
		return pHP;
	}
	public void setpHP(double pHP) {
		this.pHP = pHP;
	}
	public double getpKR() {
		return pKR;
	}
	public void setpKR(double pKR) {
		this.pKR = pKR;
	}
	public double getpLN() {
		return pLN;
	}
	public void setpLN(double pLN) {
		this.pLN = pLN;
	}
	public double getpYG() {
		return pYG;
	}
	public void setpYG(double pYG) {
		this.pYG = pYG;
	}
	public double getqAR() {
		return qAR;
	}
	public void setqAR(double qAR) {
		this.qAR = qAR;
	}
	public double getrON() {
		return rON;
	}
	public void setrON(double rON) {
		this.rON = rON;
	}
	public double getrSD() {
		return rSD;
	}
	public void setrSD(double rSD) {
		this.rSD = rSD;
	}
	public double getrUB() {
		return rUB;
	}
	public void setrUB(double rUB) {
		this.rUB = rUB;
	}
	public double getrWF() {
		return rWF;
	}
	public void setrWF(double rWF) {
		this.rWF = rWF;
	}
	public double getsAR() {
		return sAR;
	}
	public void setsAR(double sAR) {
		this.sAR = sAR;
	}
	public double getsBD() {
		return sBD;
	}
	public void setsBD(double sBD) {
		this.sBD = sBD;
	}
	public double getsCR() {
		return sCR;
	}
	public void setsCR(double sCR) {
		this.sCR = sCR;
	}
	public double getsDG() {
		return sDG;
	}
	public void setsDG(double sDG) {
		this.sDG = sDG;
	}
	public double getsEK() {
		return sEK;
	}
	public void setsEK(double sEK) {
		this.sEK = sEK;
	}
	public double getsGD() {
		return sGD;
	}
	public void setsGD(double sGD) {
		this.sGD = sGD;
	}
	public double getsHP() {
		return sHP;
	}
	public void setsHP(double sHP) {
		this.sHP = sHP;
	}
	public double getsLE() {
		return sLE;
	}
	public void setsLE(double sLE) {
		this.sLE = sLE;
	}
	public double getsLL() {
		return sLL;
	}
	public void setsLL(double sLL) {
		this.sLL = sLL;
	}
	public double getsOS() {
		return sOS;
	}
	public void setsOS(double sOS) {
		this.sOS = sOS;
	}
	public double getsRD() {
		return sRD;
	}
	public void setsRD(double sRD) {
		this.sRD = sRD;
	}
	public double getsSP() {
		return sSP;
	}
	public void setsSP(double sSP) {
		this.sSP = sSP;
	}
	public double getsTN() {
		return sTN;
	}
	public void setsTN(double sTN) {
		this.sTN = sTN;
	}
	public double getsYP() {
		return sYP;
	}
	public void setsYP(double sYP) {
		this.sYP = sYP;
	}
	public double getsZL() {
		return sZL;
	}
	public void setsZL(double sZL) {
		this.sZL = sZL;
	}
	public double gettHB() {
		return tHB;
	}
	public void settHB(double tHB) {
		this.tHB = tHB;
	}
	public double gettJS() {
		return tJS;
	}
	public void settJS(double tJS) {
		this.tJS = tJS;
	}
	public double gettMT() {
		return tMT;
	}
	public void settMT(double tMT) {
		this.tMT = tMT;
	}
	public double gettND() {
		return tND;
	}
	public void settND(double tND) {
		this.tND = tND;
	}
	public double gettOP() {
		return tOP;
	}
	public void settOP(double tOP) {
		this.tOP = tOP;
	}
	public double gettRY() {
		return tRY;
	}
	public void settRY(double tRY) {
		this.tRY = tRY;
	}
	public double gettTD() {
		return tTD;
	}
	public void settTD(double tTD) {
		this.tTD = tTD;
	}
	public double gettVD() {
		return tVD;
	}
	public void settVD(double tVD) {
		this.tVD = tVD;
	}
	public double gettWD() {
		return tWD;
	}
	public void settWD(double tWD) {
		this.tWD = tWD;
	}
	public double gettZS() {
		return tZS;
	}
	public void settZS(double tZS) {
		this.tZS = tZS;
	}
	public double getuAH() {
		return uAH;
	}
	public void setuAH(double uAH) {
		this.uAH = uAH;
	}
	public double getuGX() {
		return uGX;
	}
	public void setuGX(double uGX) {
		this.uGX = uGX;
	}
	public double getuYU() {
		return uYU;
	}
	public void setuYU(double uYU) {
		this.uYU = uYU;
	}
	public double getuZS() {
		return uZS;
	}
	public void setuZS(double uZS) {
		this.uZS = uZS;
	}
	public double getvES() {
		return vES;
	}
	public void setvES(double vES) {
		this.vES = vES;
	}
	public double getvND() {
		return vND;
	}
	public void setvND(double vND) {
		this.vND = vND;
	}
	public double getvUV() {
		return vUV;
	}
	public void setvUV(double vUV) {
		this.vUV = vUV;
	}
	public double getwST() {
		return wST;
	}
	public void setwST(double wST) {
		this.wST = wST;
	}
	public double getxAF() {
		return xAF;
	}
	public void setxAF(double xAF) {
		this.xAF = xAF;
	}
	public double getxCD() {
		return xCD;
	}
	public void setxCD(double xCD) {
		this.xCD = xCD;
	}
	public double getxDR() {
		return xDR;
	}
	public void setxDR(double xDR) {
		this.xDR = xDR;
	}
	public double getxOF() {
		return xOF;
	}
	public void setxOF(double xOF) {
		this.xOF = xOF;
	}
	public double getxPF() {
		return xPF;
	}
	public void setxPF(double xPF) {
		this.xPF = xPF;
	}
	public double getyER() {
		return yER;
	}
	public void setyER(double yER) {
		this.yER = yER;
	}
	public double getzAR() {
		return zAR;
	}
	public void setzAR(double zAR) {
		this.zAR = zAR;
	}
	public double getzMW() {
		return zMW;
	}
	public void setzMW(double zMW) {
		this.zMW = zMW;
	}
	public double getzWL() {
		return zWL;
	}
	public void setzWL(double zWL) {
		this.zWL = zWL;
	}
	    

}
