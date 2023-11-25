package com.habitrpg.android.habitica.ui.fragments;

import ad.k0;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.models.Achievement;
import com.habitrpg.android.habitica.models.QuestAchievement;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.adapter.AchievementsAdapter;
import io.realm.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: AchievementsFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3", f = "AchievementsFragment.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AchievementsFragment$onViewCreated$3 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ AchievementsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AchievementsFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$1", f = "AchievementsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements pc.q<List<? extends Achievement>, List<? extends QuestAchievement>, Continuation<? super dc.l<? extends List<? extends Achievement>, ? extends List<? extends QuestAchievement>>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.label == 0) {
                dc.n.b(obj);
                return new dc.l((List) this.L$0, (List) this.L$1);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // pc.q
        public final Object invoke(List<? extends Achievement> list, List<? extends QuestAchievement> list2, Continuation<? super dc.l<? extends List<? extends Achievement>, ? extends List<? extends QuestAchievement>>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = list;
            anonymousClass1.L$1 = list2;
            return anonymousClass1.invokeSuspend(dc.w.f13270a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AchievementsFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$4", f = "AchievementsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass4 extends kotlin.coroutines.jvm.internal.l implements pc.q<dc.l<? extends List<? extends Achievement>, ? extends List<? extends QuestAchievement>>, List<? extends QuestContent>, Continuation<? super dc.l<? extends dc.l<? extends List<? extends Achievement>, ? extends List<? extends QuestAchievement>>, ? extends List<? extends QuestContent>>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(3, continuation);
        }

        @Override // pc.q
        public final Object invoke(dc.l<? extends List<? extends Achievement>, ? extends List<? extends QuestAchievement>> lVar, List<? extends QuestContent> list, Continuation<? super dc.l<? extends dc.l<? extends List<? extends Achievement>, ? extends List<? extends QuestAchievement>>, ? extends List<? extends QuestContent>>> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
            anonymousClass4.L$0 = lVar;
            anonymousClass4.L$1 = list;
            return anonymousClass4.invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.label == 0) {
                dc.n.b(obj);
                return new dc.l((dc.l) this.L$0, (List) this.L$1);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AchievementsFragment$onViewCreated$3(AchievementsFragment achievementsFragment, Continuation<? super AchievementsFragment$onViewCreated$3> continuation) {
        super(2, continuation);
        this.this$0 = achievementsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new AchievementsFragment$onViewCreated$3(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((AchievementsFragment$onViewCreated$3) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
            dd.g A = dd.i.A(this.this$0.getUserRepository().getAchievements(), this.this$0.getUserRepository().getQuestAchievements(), new AnonymousClass1(null));
            final dd.g<List<QuestAchievement>> questAchievements = this.this$0.getUserRepository().getQuestAchievements();
            final dd.g<List<? extends String>> gVar = new dd.g<List<? extends String>>() { // from class: com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$invokeSuspend$$inlined$map$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements dd.h {
                    final /* synthetic */ dd.h $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$invokeSuspend$$inlined$map$1$2", f = "AchievementsFragment.kt", l = {223}, m = "emit")
                    /* renamed from: com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= RecyclerView.UNDEFINED_DURATION;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(dd.h hVar) {
                        this.$this_unsafeFlow = hVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                    @Override // dd.h
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                        /*
                            r5 = this;
                            boolean r0 = r7 instanceof com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r7
                            com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$invokeSuspend$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$invokeSuspend$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r7)
                        L18:
                            java.lang.Object r7 = r0.result
                            java.lang.Object r1 = ic.b.d()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            dc.n.b(r7)
                            goto L62
                        L29:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L31:
                            dc.n.b(r7)
                            dd.h r7 = r5.$this_unsafeFlow
                            java.util.List r6 = (java.util.List) r6
                            java.lang.Iterable r6 = (java.lang.Iterable) r6
                            java.util.ArrayList r2 = new java.util.ArrayList
                            r2.<init>()
                            java.util.Iterator r6 = r6.iterator()
                        L43:
                            boolean r4 = r6.hasNext()
                            if (r4 == 0) goto L59
                            java.lang.Object r4 = r6.next()
                            com.habitrpg.android.habitica.models.QuestAchievement r4 = (com.habitrpg.android.habitica.models.QuestAchievement) r4
                            java.lang.String r4 = r4.getQuestKey()
                            if (r4 == 0) goto L43
                            r2.add(r4)
                            goto L43
                        L59:
                            r0.label = r3
                            java.lang.Object r6 = r7.emit(r2, r0)
                            if (r6 != r1) goto L62
                            return r1
                        L62:
                            dc.w r6 = dc.w.f13270a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // dd.g
                public Object collect(dd.h<? super List<? extends String>> hVar, Continuation continuation) {
                    Object d11;
                    Object collect = dd.g.this.collect(new AnonymousClass2(hVar), continuation);
                    d11 = ic.d.d();
                    if (collect == d11) {
                        return collect;
                    }
                    return dc.w.f13270a;
                }
            };
            final AchievementsFragment achievementsFragment = this.this$0;
            dd.g A2 = dd.i.A(A, new dd.g<List<? extends QuestContent>>() { // from class: com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$invokeSuspend$$inlined$map$2

                /* compiled from: Emitters.kt */
                /* renamed from: com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$invokeSuspend$$inlined$map$2$2  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements dd.h {
                    final /* synthetic */ dd.h $this_unsafeFlow;
                    final /* synthetic */ AchievementsFragment this$0;

                    /* compiled from: Emitters.kt */
                    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$invokeSuspend$$inlined$map$2$2", f = "AchievementsFragment.kt", l = {224, 223}, m = "emit")
                    /* renamed from: com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$invokeSuspend$$inlined$map$2$2$1  reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= RecyclerView.UNDEFINED_DURATION;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(dd.h hVar, AchievementsFragment achievementsFragment) {
                        this.$this_unsafeFlow = hVar;
                        this.this$0 = achievementsFragment;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[RETURN] */
                    @Override // dd.h
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                        /*
                            r6 = this;
                            boolean r0 = r8 instanceof com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$invokeSuspend$$inlined$map$2.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r8
                            com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$invokeSuspend$$inlined$map$2$2$1 r0 = (com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$invokeSuspend$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$invokeSuspend$$inlined$map$2$2$1 r0 = new com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$invokeSuspend$$inlined$map$2$2$1
                            r0.<init>(r8)
                        L18:
                            java.lang.Object r8 = r0.result
                            java.lang.Object r1 = ic.b.d()
                            int r2 = r0.label
                            r3 = 2
                            r4 = 1
                            if (r2 == 0) goto L3c
                            if (r2 == r4) goto L34
                            if (r2 != r3) goto L2c
                            dc.n.b(r8)
                            goto L67
                        L2c:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r8)
                            throw r7
                        L34:
                            java.lang.Object r7 = r0.L$0
                            dd.h r7 = (dd.h) r7
                            dc.n.b(r8)
                            goto L5b
                        L3c:
                            dc.n.b(r8)
                            dd.h r8 = r6.$this_unsafeFlow
                            java.util.List r7 = (java.util.List) r7
                            com.habitrpg.android.habitica.ui.fragments.AchievementsFragment r2 = r6.this$0
                            com.habitrpg.android.habitica.data.InventoryRepository r2 = r2.getInventoryRepository()
                            dd.g r7 = r2.getQuestContent(r7)
                            r0.L$0 = r8
                            r0.label = r4
                            java.lang.Object r7 = dd.i.x(r7, r0)
                            if (r7 != r1) goto L58
                            return r1
                        L58:
                            r5 = r8
                            r8 = r7
                            r7 = r5
                        L5b:
                            r2 = 0
                            r0.L$0 = r2
                            r0.label = r3
                            java.lang.Object r7 = r7.emit(r8, r0)
                            if (r7 != r1) goto L67
                            return r1
                        L67:
                            dc.w r7 = dc.w.f13270a
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3$invokeSuspend$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // dd.g
                public Object collect(dd.h<? super List<? extends QuestContent>> hVar, Continuation continuation) {
                    Object d11;
                    Object collect = dd.g.this.collect(new AnonymousClass2(hVar, achievementsFragment), continuation);
                    d11 = ic.d.d();
                    if (collect == d11) {
                        return collect;
                    }
                    return dc.w.f13270a;
                }
            }, new AnonymousClass4(null));
            final AchievementsFragment achievementsFragment2 = this.this$0;
            dd.h hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onViewCreated$3.5
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((dc.l) obj2, (Continuation<? super dc.w>) continuation);
                }

                public final Object emit(dc.l<? extends dc.l<? extends List<? extends Achievement>, ? extends List<? extends QuestAchievement>>, ? extends List<? extends QuestContent>> lVar, Continuation<? super dc.w> continuation) {
                    int i11;
                    int s10;
                    AchievementsAdapter achievementsAdapter;
                    AchievementsAdapter achievementsAdapter2;
                    AchievementsAdapter achievementsAdapter3;
                    x0<String> challengeAchievements;
                    x0<String> challengeAchievements2;
                    QuestContent questContent;
                    T t10;
                    List<? extends Achievement> c10 = lVar.c().c();
                    ArrayList arrayList = new ArrayList();
                    List<? extends Achievement> list = c10;
                    Iterator<T> it = list.iterator();
                    String str = "";
                    while (true) {
                        i11 = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        Achievement achievement = (Achievement) it.next();
                        String category = achievement.getCategory();
                        if (category == null) {
                            category = "";
                        }
                        if (!qc.q.d(category, str)) {
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                int i12 = 0;
                                for (Achievement achievement2 : list) {
                                    if ((qc.q.d(achievement2.getCategory(), category) && achievement2.getEarned()) && (i12 = i12 + 1) < 0) {
                                        ec.t.q();
                                    }
                                }
                                i11 = i12;
                            }
                            arrayList.add(new dc.l(category, kotlin.coroutines.jvm.internal.b.d(i11)));
                            str = category;
                        }
                        arrayList.add(achievement);
                    }
                    List<? extends QuestAchievement> d11 = lVar.c().d();
                    arrayList.add(new dc.l("Quests completed", kotlin.coroutines.jvm.internal.b.d(d11.size())));
                    List<? extends QuestAchievement> list2 = d11;
                    s10 = ec.u.s(list2, 10);
                    ArrayList arrayList2 = new ArrayList(s10);
                    Iterator<T> it2 = list2.iterator();
                    while (true) {
                        achievementsAdapter = null;
                        String str2 = null;
                        if (!it2.hasNext()) {
                            break;
                        }
                        QuestAchievement questAchievement = (QuestAchievement) it2.next();
                        List<? extends QuestContent> d12 = lVar.d();
                        if (d12 != null) {
                            Iterator<T> it3 = d12.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    t10 = null;
                                    break;
                                }
                                t10 = it3.next();
                                if (qc.q.d(questAchievement.getQuestKey(), ((QuestContent) t10).getKey())) {
                                    break;
                                }
                            }
                            questContent = (QuestContent) t10;
                        } else {
                            questContent = null;
                        }
                        if (questContent != null) {
                            str2 = questContent.getText();
                        }
                        questAchievement.setTitle(str2);
                        arrayList2.add(questAchievement);
                    }
                    arrayList.addAll(arrayList2);
                    User f10 = AchievementsFragment.this.getUserViewModel().getUser().f();
                    if (f10 != null && (challengeAchievements2 = f10.getChallengeAchievements()) != null) {
                        i11 = challengeAchievements2.size();
                    }
                    if (i11 > 0) {
                        arrayList.add(new dc.l("Challenges won", kotlin.coroutines.jvm.internal.b.d(i11)));
                        if (f10 != null && (challengeAchievements = f10.getChallengeAchievements()) != null) {
                            kotlin.coroutines.jvm.internal.b.a(arrayList.addAll(challengeAchievements));
                        }
                    }
                    achievementsAdapter2 = AchievementsFragment.this.adapter;
                    if (achievementsAdapter2 == null) {
                        qc.q.z("adapter");
                        achievementsAdapter2 = null;
                    }
                    achievementsAdapter2.setEntries(arrayList);
                    achievementsAdapter3 = AchievementsFragment.this.adapter;
                    if (achievementsAdapter3 == null) {
                        qc.q.z("adapter");
                    } else {
                        achievementsAdapter = achievementsAdapter3;
                    }
                    achievementsAdapter.notifyDataSetChanged();
                    return dc.w.f13270a;
                }
            };
            this.label = 1;
            if (A2.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
