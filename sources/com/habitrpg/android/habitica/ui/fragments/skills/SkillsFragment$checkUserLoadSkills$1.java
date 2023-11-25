package com.habitrpg.android.habitica.ui.fragments.skills;

import ad.k0;
import com.habitrpg.android.habitica.models.Skill;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.adapter.SkillsRecyclerViewAdapter;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import dd.i;
import ic.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import pc.q;

/* compiled from: SkillsFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.skills.SkillsFragment$checkUserLoadSkills$1", f = "SkillsFragment.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SkillsFragment$checkUserLoadSkills$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ User $user;
    int label;
    final /* synthetic */ SkillsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SkillsFragment.kt */
    @f(c = "com.habitrpg.android.habitica.ui.fragments.skills.SkillsFragment$checkUserLoadSkills$1$1", f = "SkillsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.skills.SkillsFragment$checkUserLoadSkills$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends l implements q<List<? extends Skill>, List<? extends Skill>, Continuation<? super List<Skill>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            d.d();
            if (this.label == 0) {
                n.b(obj);
                List list = (List) this.L$0;
                List list2 = (List) this.L$1;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((Skill) it.next());
                }
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add((Skill) it2.next());
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // pc.q
        public final Object invoke(List<? extends Skill> list, List<? extends Skill> list2, Continuation<? super List<Skill>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = list;
            anonymousClass1.L$1 = list2;
            return anonymousClass1.invokeSuspend(w.f13270a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillsFragment$checkUserLoadSkills$1(SkillsFragment skillsFragment, User user, Continuation<? super SkillsFragment$checkUserLoadSkills$1> continuation) {
        super(2, continuation);
        this.this$0 = skillsFragment;
        this.$user = user;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new SkillsFragment$checkUserLoadSkills$1(this.this$0, this.$user, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((SkillsFragment$checkUserLoadSkills$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            g A = i.A(this.this$0.getUserRepository().getSkills(this.$user), this.this$0.getUserRepository().getSpecialItems(this.$user), new AnonymousClass1(null));
            final SkillsFragment skillsFragment = this.this$0;
            h hVar = new h() { // from class: com.habitrpg.android.habitica.ui.fragments.skills.SkillsFragment$checkUserLoadSkills$1.2
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(List<Skill> list, Continuation<? super w> continuation) {
                    SkillsRecyclerViewAdapter adapter$Habitica_2311256681_prodRelease = SkillsFragment.this.getAdapter$Habitica_2311256681_prodRelease();
                    if (adapter$Habitica_2311256681_prodRelease != null) {
                        adapter$Habitica_2311256681_prodRelease.setSkillList(list);
                    }
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (A.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
