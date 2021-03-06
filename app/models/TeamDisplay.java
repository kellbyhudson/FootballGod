package models;

public class TeamDisplay
{
    private Quarterback quarterback;
    private Quarterback2 quarterback2;
    private Quarterback3 quarterback3;

    private RunningBack runningBack;
    private RunningBack2 runningBack2;
    private RunningBack3 runningBack3;

    private WideReceiver1 wideReceiver1;
    private WideReceiver2 wideReceiver2;
    private WideReceiver3 wideReceiver3;
    private WideReceiver4 wideReceiver4;
    private WideReceiver5 wideReceiver5;
    private WideReceiver6 wideReceiver6;

    private TightEnd tightEnd;
    private TightEnd2 tightEnd2;

    private Tackle1 tackle1;
    private Tackle2 tackle2;
    private Tackle3 tackle3;
    private Tackle4 tackle4;

    private Guard1 guard1;
    private Guard2 guard2;
    private Guard3 guard3;
    private Guard4 guard4;

    private Center center;
    private Center2 center2;

    private DefensiveTackle1 defensiveTackle1;
    private DefensiveTackle2 defensiveTackle2;
    private DefensiveTackle3 defensiveTackle3;
    private DefensiveTackle4 defensiveTackle4;
    private DefensiveTackle5 defensiveTackle5;

    private DefensiveEnd1 defensiveEnd1;
    private DefensiveEnd2 defensiveEnd2;
    private DefensiveEnd3 defensiveEnd3;
    private DefensiveEnd4 defensiveEnd4;
    private DefensiveEnd5 defensiveEnd5;

    private OutsideLinebacker1 outsideLinebacker1;
    private OutsideLinebacker2 outsideLinebacker2;
    private OutsideLinebacker3 outsideLinebacker3;
    private OutsideLinebacker4 outsideLinebacker4;

    private InsideLinebacker insideLinebacker;
    private InsideLinebacker2 insideLinebacker2;
    private InsideLinebacker3 insideLinebacker3;

    private Safety1 safety1;
    private Safety2 safety2;
    private Safety3 safety3;
    private Safety4 safety4;

    private Cornerback1 cornerback1;
    private Cornerback2 cornerback2;
    private Cornerback3 cornerback3;
    private Cornerback4 cornerback4;

    private Punter punter;
    private Kicker kicker;

    private Holder holder;

    private LongSnapper longSnapper;

    public TeamDisplay(Quarterback quarterback, Quarterback2 quarterback2, Quarterback3 quarterback3, RunningBack runningBack, RunningBack2 runningBack2, RunningBack3 runningBack3, WideReceiver1 wideReceiver1, WideReceiver2 wideReceiver2, WideReceiver3 wideReceiver3, WideReceiver4 wideReceiver4, WideReceiver5 wideReceiver5, WideReceiver6 wideReceiver6, TightEnd tightEnd, TightEnd2 tightEnd2, Tackle1 tackle1, Tackle2 tackle2, Tackle3 tackle3, Tackle4 tackle4, Guard1 guard1, Guard2 guard2, Guard3 guard3, Guard4 guard4, Center center, Center2 center2, DefensiveTackle1 defensiveTackle1, DefensiveTackle2 defensiveTackle2, DefensiveTackle3 defensiveTackle3, DefensiveTackle4 defensiveTackle4, DefensiveTackle5 defensiveTackle5, DefensiveEnd1 defensiveEnd1, DefensiveEnd2 defensiveEnd2, DefensiveEnd3 defensiveEnd3, DefensiveEnd4 defensiveEnd4, DefensiveEnd5 defensiveEnd5, OutsideLinebacker1 outsideLinebacker1, OutsideLinebacker2 outsideLinebacker2, OutsideLinebacker3 outsideLinebacker3, OutsideLinebacker4 outsideLinebacker4, InsideLinebacker insideLinebacker, InsideLinebacker2 insideLinebacker2, InsideLinebacker3 insideLinebacker3, Safety1 safety1, Safety2 safety2, Safety3 safety3, Safety4 safety4, Cornerback1 cornerback1, Cornerback2 cornerback2, Cornerback3 cornerback3, Cornerback4 cornerback4, Punter punter, Kicker kicker, Holder holder, LongSnapper longSnapper)
    {
        this.quarterback = quarterback;
        this.quarterback2 = quarterback2;
        this.quarterback3 = quarterback3;
        this.runningBack = runningBack;
        this.runningBack2 = runningBack2;
        this.runningBack3 = runningBack3;
        this.wideReceiver1 = wideReceiver1;
        this.wideReceiver2 = wideReceiver2;
        this.wideReceiver3 = wideReceiver3;
        this.wideReceiver4 = wideReceiver4;
        this.wideReceiver5 = wideReceiver5;
        this.wideReceiver6 = wideReceiver6;
        this.tightEnd = tightEnd;
        this.tightEnd2 = tightEnd2;
        this.tackle1 = tackle1;
        this.tackle2 = tackle2;
        this.tackle3 = tackle3;
        this.tackle4 = tackle4;
        this.guard1 = guard1;
        this.guard2 = guard2;
        this.guard3 = guard3;
        this.guard4 = guard4;
        this.center = center;
        this.center2 = center2;
        this.defensiveTackle1 = defensiveTackle1;
        this.defensiveTackle2 = defensiveTackle2;
        this.defensiveTackle3 = defensiveTackle3;
        this.defensiveTackle4 = defensiveTackle4;
        this.defensiveTackle5 = defensiveTackle5;
        this.defensiveEnd1 = defensiveEnd1;
        this.defensiveEnd2 = defensiveEnd2;
        this.defensiveEnd3 = defensiveEnd3;
        this.defensiveEnd4 = defensiveEnd4;
        this.defensiveEnd5 = defensiveEnd5;
        this.outsideLinebacker1 = outsideLinebacker1;
        this.outsideLinebacker2 = outsideLinebacker2;
        this.outsideLinebacker3 = outsideLinebacker3;
        this.outsideLinebacker4 = outsideLinebacker4;
        this.insideLinebacker = insideLinebacker;
        this.insideLinebacker2 = insideLinebacker2;
        this.insideLinebacker3 = insideLinebacker3;
        this.safety1 = safety1;
        this.safety2 = safety2;
        this.safety3 = safety3;
        this.safety4 = safety4;
        this.cornerback1 = cornerback1;
        this.cornerback2 = cornerback2;
        this.cornerback3 = cornerback3;
        this.cornerback4 = cornerback4;
        this.punter = punter;
        this.kicker = kicker;
        this.holder = holder;
        this.longSnapper = longSnapper;
    }

    public Quarterback getQuarterback()
    {
        return quarterback;
    }

    public void setQuarterback(Quarterback quarterback)
    {
        this.quarterback = quarterback;
    }

    public Quarterback2 getQuarterback2()
    {
        return quarterback2;
    }

    public void setQuarterback2(Quarterback2 quarterback2)
    {
        this.quarterback2 = quarterback2;
    }

    public Quarterback3 getQuarterback3()
    {
        return quarterback3;
    }

    public void setQuarterback3(Quarterback3 quarterback3)
    {
        this.quarterback3 = quarterback3;
    }

    public RunningBack getRunningBack()
    {
        return runningBack;
    }

    public void setRunningBack(RunningBack runningBack)
    {
        this.runningBack = runningBack;
    }

    public RunningBack2 getRunningBack2()
    {
        return runningBack2;
    }

    public void setRunningBack2(RunningBack2 runningBack2)
    {
        this.runningBack2 = runningBack2;
    }

    public RunningBack3 getRunningBack3()
    {
        return runningBack3;
    }

    public void setRunningBack3(RunningBack3 runningBack3)
    {
        this.runningBack3 = runningBack3;
    }

    public WideReceiver1 getWideReceiver1()
    {
        return wideReceiver1;
    }

    public void setWideReceiver1(WideReceiver1 wideReceiver1)
    {
        this.wideReceiver1 = wideReceiver1;
    }

    public WideReceiver2 getWideReceiver2()
    {
        return wideReceiver2;
    }

    public void setWideReceiver2(WideReceiver2 wideReceiver2)
    {
        this.wideReceiver2 = wideReceiver2;
    }

    public WideReceiver3 getWideReceiver3()
    {
        return wideReceiver3;
    }

    public void setWideReceiver3(WideReceiver3 wideReceiver3)
    {
        this.wideReceiver3 = wideReceiver3;
    }

    public WideReceiver4 getWideReceiver4()
    {
        return wideReceiver4;
    }

    public void setWideReceiver4(WideReceiver4 wideReceiver4)
    {
        this.wideReceiver4 = wideReceiver4;
    }

    public WideReceiver5 getWideReceiver5()
    {
        return wideReceiver5;
    }

    public void setWideReceiver5(WideReceiver5 wideReceiver5)
    {
        this.wideReceiver5 = wideReceiver5;
    }

    public WideReceiver6 getWideReceiver6()
    {
        return wideReceiver6;
    }

    public void setWideReceiver6(WideReceiver6 wideReceiver6)
    {
        this.wideReceiver6 = wideReceiver6;
    }

    public TightEnd getTightEnd()
    {
        return tightEnd;
    }

    public void setTightEnd(TightEnd tightEnd)
    {
        this.tightEnd = tightEnd;
    }

    public TightEnd2 getTightEnd2()
    {
        return tightEnd2;
    }

    public void setTightEnd2(TightEnd2 tightEnd2)
    {
        this.tightEnd2 = tightEnd2;
    }

    public Tackle1 getTackle1()
    {
        return tackle1;
    }

    public void setTackle1(Tackle1 tackle1)
    {
        this.tackle1 = tackle1;
    }

    public Tackle2 getTackle2()
    {
        return tackle2;
    }

    public void setTackle2(Tackle2 tackle2)
    {
        this.tackle2 = tackle2;
    }

    public Tackle3 getTackle3()
    {
        return tackle3;
    }

    public void setTackle3(Tackle3 tackle3)
    {
        this.tackle3 = tackle3;
    }

    public Tackle4 getTackle4()
    {
        return tackle4;
    }

    public void setTackle4(Tackle4 tackle4)
    {
        this.tackle4 = tackle4;
    }

    public Guard1 getGuard1()
    {
        return guard1;
    }

    public void setGuard1(Guard1 guard1)
    {
        this.guard1 = guard1;
    }

    public Guard2 getGuard2()
    {
        return guard2;
    }

    public void setGuard2(Guard2 guard2)
    {
        this.guard2 = guard2;
    }

    public Guard3 getGuard3()
    {
        return guard3;
    }

    public void setGuard3(Guard3 guard3)
    {
        this.guard3 = guard3;
    }

    public Guard4 getGuard4()
    {
        return guard4;
    }

    public void setGuard4(Guard4 guard4)
    {
        this.guard4 = guard4;
    }

    public Center getCenter()
    {
        return center;
    }

    public void setCenter(Center center)
    {
        this.center = center;
    }

    public Center2 getCenter2()
    {
        return center2;
    }

    public void setCenter2(Center2 center2)
    {
        this.center2 = center2;
    }

    public DefensiveTackle1 getDefensiveTackle1()
    {
        return defensiveTackle1;
    }

    public void setDefensiveTackle1(DefensiveTackle1 defensiveTackle1)
    {
        this.defensiveTackle1 = defensiveTackle1;
    }

    public DefensiveTackle2 getDefensiveTackle2()
    {
        return defensiveTackle2;
    }

    public void setDefensiveTackle2(DefensiveTackle2 defensiveTackle2)
    {
        this.defensiveTackle2 = defensiveTackle2;
    }

    public DefensiveTackle3 getDefensiveTackle3()
    {
        return defensiveTackle3;
    }

    public void setDefensiveTackle3(DefensiveTackle3 defensiveTackle3)
    {
        this.defensiveTackle3 = defensiveTackle3;
    }

    public DefensiveTackle4 getDefensiveTackle4()
    {
        return defensiveTackle4;
    }

    public void setDefensiveTackle4(DefensiveTackle4 defensiveTackle4)
    {
        this.defensiveTackle4 = defensiveTackle4;
    }

    public DefensiveTackle5 getDefensiveTackle5()
    {
        return defensiveTackle5;
    }

    public void setDefensiveTackle5(DefensiveTackle5 defensiveTackle5)
    {
        this.defensiveTackle5 = defensiveTackle5;
    }

    public DefensiveEnd1 getDefensiveEnd1()
    {
        return defensiveEnd1;
    }

    public void setDefensiveEnd1(DefensiveEnd1 defensiveEnd1)
    {
        this.defensiveEnd1 = defensiveEnd1;
    }

    public DefensiveEnd2 getDefensiveEnd2()
    {
        return defensiveEnd2;
    }

    public void setDefensiveEnd2(DefensiveEnd2 defensiveEnd2)
    {
        this.defensiveEnd2 = defensiveEnd2;
    }

    public DefensiveEnd3 getDefensiveEnd3()
    {
        return defensiveEnd3;
    }

    public void setDefensiveEnd3(DefensiveEnd3 defensiveEnd3)
    {
        this.defensiveEnd3 = defensiveEnd3;
    }

    public DefensiveEnd4 getDefensiveEnd4()
    {
        return defensiveEnd4;
    }

    public void setDefensiveEnd4(DefensiveEnd4 defensiveEnd4)
    {
        this.defensiveEnd4 = defensiveEnd4;
    }

    public DefensiveEnd5 getDefensiveEnd5()
    {
        return defensiveEnd5;
    }

    public void setDefensiveEnd5(DefensiveEnd5 defensiveEnd5)
    {
        this.defensiveEnd5 = defensiveEnd5;
    }

    public OutsideLinebacker1 getOutsideLinebacker1()
    {
        return outsideLinebacker1;
    }

    public void setOutsideLinebacker1(OutsideLinebacker1 outsideLinebacker1)
    {
        this.outsideLinebacker1 = outsideLinebacker1;
    }

    public OutsideLinebacker2 getOutsideLinebacker2()
    {
        return outsideLinebacker2;
    }

    public void setOutsideLinebacker2(OutsideLinebacker2 outsideLinebacker2)
    {
        this.outsideLinebacker2 = outsideLinebacker2;
    }

    public OutsideLinebacker3 getOutsideLinebacker3()
    {
        return outsideLinebacker3;
    }

    public void setOutsideLinebacker3(OutsideLinebacker3 outsideLinebacker3)
    {
        this.outsideLinebacker3 = outsideLinebacker3;
    }

    public OutsideLinebacker4 getOutsideLinebacker4()
    {
        return outsideLinebacker4;
    }

    public void setOutsideLinebacker4(OutsideLinebacker4 outsideLinebacker4)
    {
        this.outsideLinebacker4 = outsideLinebacker4;
    }

    public InsideLinebacker getInsideLinebacker()
    {
        return insideLinebacker;
    }

    public void setInsideLinebacker(InsideLinebacker insideLinebacker)
    {
        this.insideLinebacker = insideLinebacker;
    }

    public InsideLinebacker2 getInsideLinebacker2()
    {
        return insideLinebacker2;
    }

    public void setInsideLinebacker2(InsideLinebacker2 insideLinebacker2)
    {
        this.insideLinebacker2 = insideLinebacker2;
    }

    public InsideLinebacker3 getInsideLinebacker3()
    {
        return insideLinebacker3;
    }

    public void setInsideLinebacker3(InsideLinebacker3 insideLinebacker3)
    {
        this.insideLinebacker3 = insideLinebacker3;
    }

    public Safety1 getSafety1()
    {
        return safety1;
    }

    public void setSafety1(Safety1 safety1)
    {
        this.safety1 = safety1;
    }

    public Safety2 getSafety2()
    {
        return safety2;
    }

    public void setSafety2(Safety2 safety2)
    {
        this.safety2 = safety2;
    }

    public Safety3 getSafety3()
    {
        return safety3;
    }

    public void setSafety3(Safety3 safety3)
    {
        this.safety3 = safety3;
    }

    public Safety4 getSafety4()
    {
        return safety4;
    }

    public void setSafety4(Safety4 safety4)
    {
        this.safety4 = safety4;
    }

    public Cornerback1 getCornerback1()
    {
        return cornerback1;
    }

    public void setCornerback1(Cornerback1 cornerback1)
    {
        this.cornerback1 = cornerback1;
    }

    public Cornerback2 getCornerback2()
    {
        return cornerback2;
    }

    public void setCornerback2(Cornerback2 cornerback2)
    {
        this.cornerback2 = cornerback2;
    }

    public Cornerback3 getCornerback3()
    {
        return cornerback3;
    }

    public void setCornerback3(Cornerback3 cornerback3)
    {
        this.cornerback3 = cornerback3;
    }

    public Cornerback4 getCornerback4()
    {
        return cornerback4;
    }

    public void setCornerback4(Cornerback4 cornerback4)
    {
        this.cornerback4 = cornerback4;
    }

    public Punter getPunter()
    {
        return punter;
    }

    public void setPunter(Punter punter)
    {
        this.punter = punter;
    }

    public Kicker getKicker()
    {
        return kicker;
    }

    public void setKicker(Kicker kicker)
    {
        this.kicker = kicker;
    }

    public Holder getHolder()
    {
        return holder;
    }

    public void setHolder(Holder holder)
    {
        this.holder = holder;
    }

    public LongSnapper getLongSnapper()
    {
        return longSnapper;
    }

    public void setLongSnapper(LongSnapper longSnapper)
    {
        this.longSnapper = longSnapper;
    }
}
