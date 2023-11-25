package com.habitrpg.android.habitica.ui.fragments;

import ad.k0;
import com.habitrpg.android.habitica.databinding.FragmentStatsBinding;
import com.habitrpg.android.habitica.helpers.UserStatComputer;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.models.user.Buffs;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.views.stats.StatsView;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StatsFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.StatsFragment$updateStats$2", f = "StatsFragment.kt", l = {264}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class StatsFragment$updateStats$2 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ ArrayList<String> $outfitList;
    final /* synthetic */ User $user;
    int label;
    final /* synthetic */ StatsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsFragment$updateStats$2(StatsFragment statsFragment, ArrayList<String> arrayList, User user, Continuation<? super StatsFragment$updateStats$2> continuation) {
        super(2, continuation);
        this.this$0 = statsFragment;
        this.$outfitList = arrayList;
        this.$user = user;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new StatsFragment$updateStats$2(this.this$0, this.$outfitList, this.$user, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((StatsFragment$updateStats$2) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        int i10;
        StatsView statsView;
        StatsView statsView2;
        StatsView statsView3;
        StatsView statsView4;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        StatsView statsView5;
        StatsView statsView6;
        StatsView statsView7;
        StatsView statsView8;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        StatsView statsView9;
        StatsView statsView10;
        StatsView statsView11;
        StatsView statsView12;
        int i27;
        int i28;
        int i29;
        int i30;
        StatsView statsView13;
        StatsView statsView14;
        StatsView statsView15;
        int i31;
        Integer per;
        int i32;
        Integer constitution;
        int i33;
        Integer intelligence;
        int i34;
        Integer strength;
        Integer per2;
        Integer constitution2;
        Integer intelligence2;
        Integer strength2;
        int i35;
        Buffs buffs;
        Float per3;
        int i36;
        Buffs buffs2;
        Float con;
        int i37;
        Buffs buffs3;
        Float f10;
        int i38;
        Buffs buffs4;
        Float str;
        Buffs buffs5;
        Float per4;
        Buffs buffs6;
        Float con2;
        Buffs buffs7;
        Float f11;
        Buffs buffs8;
        Float str2;
        Integer lvl;
        d10 = ic.d.d();
        int i39 = this.label;
        if (i39 != 0) {
            if (i39 == 1) {
                dc.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dc.n.b(obj);
            dd.g<List<Equipment>> equipment = this.this$0.getInventoryRepository().getEquipment(this.$outfitList);
            this.label = 1;
            obj = dd.i.x(equipment, this);
            if (obj == d10) {
                return d10;
            }
        }
        List<? extends Equipment> list = (List) obj;
        Stats stats = this.$user.getStats();
        int i40 = 0;
        if (stats != null && (lvl = stats.getLvl()) != null) {
            i10 = lvl.intValue();
        } else {
            i10 = 0;
        }
        int min = (int) Math.min(i10 / 2.0f, 50.0f);
        this.this$0.setTotalStrength(min);
        this.this$0.setTotalIntelligence(min);
        this.this$0.setTotalConstitution(min);
        this.this$0.setTotalPerception(min);
        FragmentStatsBinding binding = this.this$0.getBinding();
        StatsView statsView16 = null;
        if (binding != null) {
            statsView = binding.strengthStatsView;
        } else {
            statsView = null;
        }
        if (statsView != null) {
            statsView.setLevelValue(min);
        }
        FragmentStatsBinding binding2 = this.this$0.getBinding();
        if (binding2 != null) {
            statsView2 = binding2.intelligenceStatsView;
        } else {
            statsView2 = null;
        }
        if (statsView2 != null) {
            statsView2.setLevelValue(min);
        }
        FragmentStatsBinding binding3 = this.this$0.getBinding();
        if (binding3 != null) {
            statsView3 = binding3.constitutionStatsView;
        } else {
            statsView3 = null;
        }
        if (statsView3 != null) {
            statsView3.setLevelValue(min);
        }
        FragmentStatsBinding binding4 = this.this$0.getBinding();
        if (binding4 != null) {
            statsView4 = binding4.perceptionStatsView;
        } else {
            statsView4 = null;
        }
        if (statsView4 != null) {
            statsView4.setLevelValue(min);
        }
        StatsFragment statsFragment = this.this$0;
        i11 = statsFragment.totalStrength;
        Stats stats2 = this.$user.getStats();
        if (stats2 != null && (buffs8 = stats2.getBuffs()) != null && (str2 = buffs8.getStr()) != null) {
            i12 = (int) str2.floatValue();
        } else {
            i12 = 0;
        }
        statsFragment.setTotalStrength(i11 + i12);
        StatsFragment statsFragment2 = this.this$0;
        i13 = statsFragment2.totalIntelligence;
        Stats stats3 = this.$user.getStats();
        if (stats3 != null && (buffs7 = stats3.getBuffs()) != null && (f11 = buffs7.get_int()) != null) {
            i14 = (int) f11.floatValue();
        } else {
            i14 = 0;
        }
        statsFragment2.setTotalIntelligence(i13 + i14);
        StatsFragment statsFragment3 = this.this$0;
        i15 = statsFragment3.totalConstitution;
        Stats stats4 = this.$user.getStats();
        if (stats4 != null && (buffs6 = stats4.getBuffs()) != null && (con2 = buffs6.getCon()) != null) {
            i16 = (int) con2.floatValue();
        } else {
            i16 = 0;
        }
        statsFragment3.setTotalConstitution(i15 + i16);
        StatsFragment statsFragment4 = this.this$0;
        i17 = statsFragment4.totalPerception;
        Stats stats5 = this.$user.getStats();
        if (stats5 != null && (buffs5 = stats5.getBuffs()) != null && (per4 = buffs5.getPer()) != null) {
            i18 = (int) per4.floatValue();
        } else {
            i18 = 0;
        }
        statsFragment4.setTotalPerception(i17 + i18);
        FragmentStatsBinding binding5 = this.this$0.getBinding();
        if (binding5 != null) {
            statsView5 = binding5.strengthStatsView;
        } else {
            statsView5 = null;
        }
        if (statsView5 != null) {
            Stats stats6 = this.$user.getStats();
            if (stats6 != null && (buffs4 = stats6.getBuffs()) != null && (str = buffs4.getStr()) != null) {
                i38 = (int) str.floatValue();
            } else {
                i38 = 0;
            }
            statsView5.setBuffValue(i38);
        }
        FragmentStatsBinding binding6 = this.this$0.getBinding();
        if (binding6 != null) {
            statsView6 = binding6.intelligenceStatsView;
        } else {
            statsView6 = null;
        }
        if (statsView6 != null) {
            Stats stats7 = this.$user.getStats();
            if (stats7 != null && (buffs3 = stats7.getBuffs()) != null && (f10 = buffs3.get_int()) != null) {
                i37 = (int) f10.floatValue();
            } else {
                i37 = 0;
            }
            statsView6.setBuffValue(i37);
        }
        FragmentStatsBinding binding7 = this.this$0.getBinding();
        if (binding7 != null) {
            statsView7 = binding7.constitutionStatsView;
        } else {
            statsView7 = null;
        }
        if (statsView7 != null) {
            Stats stats8 = this.$user.getStats();
            if (stats8 != null && (buffs2 = stats8.getBuffs()) != null && (con = buffs2.getCon()) != null) {
                i36 = (int) con.floatValue();
            } else {
                i36 = 0;
            }
            statsView7.setBuffValue(i36);
        }
        FragmentStatsBinding binding8 = this.this$0.getBinding();
        if (binding8 != null) {
            statsView8 = binding8.perceptionStatsView;
        } else {
            statsView8 = null;
        }
        if (statsView8 != null) {
            Stats stats9 = this.$user.getStats();
            if (stats9 != null && (buffs = stats9.getBuffs()) != null && (per3 = buffs.getPer()) != null) {
                i35 = (int) per3.floatValue();
            } else {
                i35 = 0;
            }
            statsView8.setBuffValue(i35);
        }
        StatsFragment statsFragment5 = this.this$0;
        i19 = statsFragment5.totalStrength;
        Stats stats10 = this.$user.getStats();
        if (stats10 != null && (strength2 = stats10.getStrength()) != null) {
            i20 = strength2.intValue();
        } else {
            i20 = 0;
        }
        statsFragment5.setTotalStrength(i19 + i20);
        StatsFragment statsFragment6 = this.this$0;
        i21 = statsFragment6.totalIntelligence;
        Stats stats11 = this.$user.getStats();
        if (stats11 != null && (intelligence2 = stats11.getIntelligence()) != null) {
            i22 = intelligence2.intValue();
        } else {
            i22 = 0;
        }
        statsFragment6.setTotalIntelligence(i21 + i22);
        StatsFragment statsFragment7 = this.this$0;
        i23 = statsFragment7.totalConstitution;
        Stats stats12 = this.$user.getStats();
        if (stats12 != null && (constitution2 = stats12.getConstitution()) != null) {
            i24 = constitution2.intValue();
        } else {
            i24 = 0;
        }
        statsFragment7.setTotalConstitution(i23 + i24);
        StatsFragment statsFragment8 = this.this$0;
        i25 = statsFragment8.totalPerception;
        Stats stats13 = this.$user.getStats();
        if (stats13 != null && (per2 = stats13.getPer()) != null) {
            i26 = per2.intValue();
        } else {
            i26 = 0;
        }
        statsFragment8.setTotalPerception(i25 + i26);
        FragmentStatsBinding binding9 = this.this$0.getBinding();
        if (binding9 != null) {
            statsView9 = binding9.strengthStatsView;
        } else {
            statsView9 = null;
        }
        if (statsView9 != null) {
            Stats stats14 = this.$user.getStats();
            if (stats14 != null && (strength = stats14.getStrength()) != null) {
                i34 = strength.intValue();
            } else {
                i34 = 0;
            }
            statsView9.setAllocatedValue(i34);
        }
        FragmentStatsBinding binding10 = this.this$0.getBinding();
        if (binding10 != null) {
            statsView10 = binding10.intelligenceStatsView;
        } else {
            statsView10 = null;
        }
        if (statsView10 != null) {
            Stats stats15 = this.$user.getStats();
            if (stats15 != null && (intelligence = stats15.getIntelligence()) != null) {
                i33 = intelligence.intValue();
            } else {
                i33 = 0;
            }
            statsView10.setAllocatedValue(i33);
        }
        FragmentStatsBinding binding11 = this.this$0.getBinding();
        if (binding11 != null) {
            statsView11 = binding11.constitutionStatsView;
        } else {
            statsView11 = null;
        }
        if (statsView11 != null) {
            Stats stats16 = this.$user.getStats();
            if (stats16 != null && (constitution = stats16.getConstitution()) != null) {
                i32 = constitution.intValue();
            } else {
                i32 = 0;
            }
            statsView11.setAllocatedValue(i32);
        }
        FragmentStatsBinding binding12 = this.this$0.getBinding();
        if (binding12 != null) {
            statsView12 = binding12.perceptionStatsView;
        } else {
            statsView12 = null;
        }
        if (statsView12 != null) {
            Stats stats17 = this.$user.getStats();
            if (stats17 != null && (per = stats17.getPer()) != null) {
                i31 = per.intValue();
            } else {
                i31 = 0;
            }
            statsView12.setAllocatedValue(i31);
        }
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        for (UserStatComputer.StatsRow statsRow : new UserStatComputer().computeClassBonus(list, this.$user)) {
            if (qc.q.d(statsRow.getClass(), UserStatComputer.AttributeRow.class)) {
                qc.q.g(statsRow, "null cannot be cast to non-null type com.habitrpg.android.habitica.helpers.UserStatComputer.AttributeRow");
                UserStatComputer.AttributeRow attributeRow = (UserStatComputer.AttributeRow) statsRow;
                i40 += (int) attributeRow.getStrVal();
                i41 += (int) attributeRow.getIntVal();
                i42 += (int) attributeRow.getConVal();
                i43 += (int) attributeRow.getPerVal();
            }
        }
        StatsFragment statsFragment9 = this.this$0;
        i27 = statsFragment9.totalStrength;
        statsFragment9.setTotalStrength(i27 + i40);
        StatsFragment statsFragment10 = this.this$0;
        i28 = statsFragment10.totalIntelligence;
        statsFragment10.setTotalIntelligence(i28 + i41);
        StatsFragment statsFragment11 = this.this$0;
        i29 = statsFragment11.totalConstitution;
        statsFragment11.setTotalConstitution(i29 + i42);
        StatsFragment statsFragment12 = this.this$0;
        i30 = statsFragment12.totalPerception;
        statsFragment12.setTotalPerception(i30 + i43);
        FragmentStatsBinding binding13 = this.this$0.getBinding();
        if (binding13 != null) {
            statsView13 = binding13.strengthStatsView;
        } else {
            statsView13 = null;
        }
        if (statsView13 != null) {
            statsView13.setEquipmentValue(i40);
        }
        FragmentStatsBinding binding14 = this.this$0.getBinding();
        if (binding14 != null) {
            statsView14 = binding14.intelligenceStatsView;
        } else {
            statsView14 = null;
        }
        if (statsView14 != null) {
            statsView14.setEquipmentValue(i41);
        }
        FragmentStatsBinding binding15 = this.this$0.getBinding();
        if (binding15 != null) {
            statsView15 = binding15.constitutionStatsView;
        } else {
            statsView15 = null;
        }
        if (statsView15 != null) {
            statsView15.setEquipmentValue(i42);
        }
        FragmentStatsBinding binding16 = this.this$0.getBinding();
        if (binding16 != null) {
            statsView16 = binding16.perceptionStatsView;
        }
        if (statsView16 != null) {
            statsView16.setEquipmentValue(i43);
        }
        return dc.w.f13270a;
    }
}
