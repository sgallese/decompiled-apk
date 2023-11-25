package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.databinding.ActivityCreateChallengeBinding;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChallengeFormActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity$fillControlsByChallenge$1$1", f = "ChallengeFormActivity.kt", l = {422}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ChallengeFormActivity$fillControlsByChallenge$1$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ String $it;
    int label;
    final /* synthetic */ ChallengeFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeFormActivity$fillControlsByChallenge$1$1(ChallengeFormActivity challengeFormActivity, String str, Continuation<? super ChallengeFormActivity$fillControlsByChallenge$1$1> continuation) {
        super(2, continuation);
        this.this$0 = challengeFormActivity;
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new ChallengeFormActivity$fillControlsByChallenge$1$1(this.this$0, this.$it, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((ChallengeFormActivity$fillControlsByChallenge$1$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                dc.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dc.n.b(obj);
            dd.g<Challenge> challenge = this.this$0.getChallengeRepository$Habitica_2311256681_prodRelease().getChallenge(this.$it);
            final ChallengeFormActivity challengeFormActivity = this.this$0;
            dd.h<? super Challenge> hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity$fillControlsByChallenge$1$1.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Challenge) obj2, (Continuation<? super dc.w>) continuation);
                }

                public final Object emit(Challenge challenge2, Continuation<? super dc.w> continuation) {
                    ActivityCreateChallengeBinding activityCreateChallengeBinding;
                    ActivityCreateChallengeBinding activityCreateChallengeBinding2;
                    ActivityCreateChallengeBinding activityCreateChallengeBinding3;
                    ActivityCreateChallengeBinding activityCreateChallengeBinding4;
                    ActivityCreateChallengeBinding activityCreateChallengeBinding5;
                    ChallengeFormActivity.GroupArrayAdapter groupArrayAdapter;
                    ChallengeFormActivity.GroupArrayAdapter groupArrayAdapter2;
                    ActivityCreateChallengeBinding activityCreateChallengeBinding6;
                    ChallengeFormActivity.this.groupID = challenge2.getGroupId();
                    ChallengeFormActivity.this.editMode = true;
                    activityCreateChallengeBinding = ChallengeFormActivity.this.binding;
                    ActivityCreateChallengeBinding activityCreateChallengeBinding7 = null;
                    if (activityCreateChallengeBinding == null) {
                        qc.q.z("binding");
                        activityCreateChallengeBinding = null;
                    }
                    activityCreateChallengeBinding.createChallengeTitle.setText(challenge2.getName());
                    activityCreateChallengeBinding2 = ChallengeFormActivity.this.binding;
                    if (activityCreateChallengeBinding2 == null) {
                        qc.q.z("binding");
                        activityCreateChallengeBinding2 = null;
                    }
                    activityCreateChallengeBinding2.createChallengeDescription.setText(challenge2.getDescription());
                    activityCreateChallengeBinding3 = ChallengeFormActivity.this.binding;
                    if (activityCreateChallengeBinding3 == null) {
                        qc.q.z("binding");
                        activityCreateChallengeBinding3 = null;
                    }
                    activityCreateChallengeBinding3.createChallengeTag.setText(challenge2.getShortName());
                    activityCreateChallengeBinding4 = ChallengeFormActivity.this.binding;
                    if (activityCreateChallengeBinding4 == null) {
                        qc.q.z("binding");
                        activityCreateChallengeBinding4 = null;
                    }
                    activityCreateChallengeBinding4.createChallengePrize.setText(String.valueOf(challenge2.getPrize()));
                    activityCreateChallengeBinding5 = ChallengeFormActivity.this.binding;
                    if (activityCreateChallengeBinding5 == null) {
                        qc.q.z("binding");
                        activityCreateChallengeBinding5 = null;
                    }
                    activityCreateChallengeBinding5.challengeCreationViews.setVisibility(8);
                    groupArrayAdapter = ChallengeFormActivity.this.locationAdapter;
                    if (groupArrayAdapter == null) {
                        qc.q.z("locationAdapter");
                        groupArrayAdapter = null;
                    }
                    int count = groupArrayAdapter.getCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= count) {
                            break;
                        }
                        groupArrayAdapter2 = ChallengeFormActivity.this.locationAdapter;
                        if (groupArrayAdapter2 == null) {
                            qc.q.z("locationAdapter");
                            groupArrayAdapter2 = null;
                        }
                        Group group = (Group) groupArrayAdapter2.getItem(i11);
                        if (group == null || !qc.q.d(challenge2.getGroupId(), group.getId())) {
                            i11++;
                        } else {
                            activityCreateChallengeBinding6 = ChallengeFormActivity.this.binding;
                            if (activityCreateChallengeBinding6 == null) {
                                qc.q.z("binding");
                            } else {
                                activityCreateChallengeBinding7 = activityCreateChallengeBinding6;
                            }
                            activityCreateChallengeBinding7.challengeLocationSpinner.setSelection(i11);
                        }
                    }
                    ChallengeFormActivity.this.checkPrizeAndMinimumForTavern();
                    return dc.w.f13270a;
                }
            };
            this.label = 1;
            if (challenge.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
