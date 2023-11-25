package com.habitrpg.android.habitica.data.local.implementation;

import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.data.local.SocialLocalRepository;
import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.models.social.ChatMessageLike;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.social.GroupMembership;
import com.habitrpg.android.habitica.models.social.InboxConversation;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import dc.w;
import dd.g;
import dd.h;
import dd.i;
import ec.b0;
import io.realm.g1;
import io.realm.j1;
import io.realm.o0;
import io.realm.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qc.q;

/* compiled from: RealmSocialLocalRepository.kt */
/* loaded from: classes4.dex */
public final class RealmSocialLocalRepository extends RealmBaseLocalRepository implements SocialLocalRepository {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmSocialLocalRepository(o0 o0Var) {
        super(o0Var);
        q.i(o0Var, "realm");
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public void deleteMessage(String str) {
        q.i(str, "id");
        executeTransaction(new RealmSocialLocalRepository$deleteMessage$1((ChatMessage) getRealm().k1(ChatMessage.class).n("id", str).q()));
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public boolean doesGroupExist(String str) {
        q.i(str, "id");
        Group group = (Group) getRealm().k1(Group.class).n("id", str).q();
        if (group != null && group.isValid()) {
            return true;
        }
        return false;
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public g<Group> getGroup(String str) {
        q.i(str, "id");
        g1 p10 = getRealm().k1(Group.class).n("id", str).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        final g<g1<Group>> gVar = new g<g1<Group>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroup$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroup$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroup$$inlined$filter$1$2", f = "RealmSocialLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroup$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(h hVar) {
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
                        boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroup$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroup$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroup$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroup$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroup$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r7)
                        goto L59
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        dc.n.b(r7)
                        dd.h r7 = r5.$this_unsafeFlow
                        r2 = r6
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r4 = r2.isLoaded()
                        if (r4 == 0) goto L4d
                        boolean r4 = r2.isValid()
                        if (r4 == 0) goto L4d
                        boolean r2 = r2.isEmpty()
                        if (r2 != 0) goto L4d
                        r2 = 1
                        goto L4e
                    L4d:
                        r2 = 0
                    L4e:
                        if (r2 == 0) goto L59
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L59
                        return r1
                    L59:
                        dc.w r6 = dc.w.f13270a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroup$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<Group>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
        return new g<Group>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroup$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroup$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroup$$inlined$map$1$2", f = "RealmSocialLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroup$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
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

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroup$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroup$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroup$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroup$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroup$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        io.realm.g1 r5 = (io.realm.g1) r5
                        java.lang.Object r5 = r5.first()
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroup$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super Group> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public g<List<ChatMessage>> getGroupChat(String str) {
        q.i(str, TaskFormActivity.GROUP_ID_KEY);
        g1 p10 = getRealm().k1(ChatMessage.class).n(TaskFormActivity.GROUP_ID_KEY, str).J("timestamp", j1.DESCENDING).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return new g<g1<ChatMessage>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupChat$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupChat$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupChat$$inlined$filter$1$2", f = "RealmSocialLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupChat$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupChat$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupChat$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupChat$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupChat$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupChat$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupChat$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<ChatMessage>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public g<g1<Member>> getGroupMembers(String str) {
        q.i(str, "groupID");
        g1 p10 = getRealm().k1(GroupMembership.class).n("groupID", str).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return i.R(new g<String[]>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembers$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembers$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembers$$inlined$map$1$2", f = "RealmSocialLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembers$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
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

                public AnonymousClass2(h hVar) {
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
                        boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembers$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembers$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembers$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembers$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembers$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r7)
                        goto L6b
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        dc.n.b(r7)
                        dd.h r7 = r5.$this_unsafeFlow
                        io.realm.g1 r6 = (io.realm.g1) r6
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r4 = 10
                        int r4 = ec.r.s(r6, r4)
                        r2.<init>(r4)
                        java.util.Iterator r6 = r6.iterator()
                    L47:
                        boolean r4 = r6.hasNext()
                        if (r4 == 0) goto L5b
                        java.lang.Object r4 = r6.next()
                        com.habitrpg.android.habitica.models.social.GroupMembership r4 = (com.habitrpg.android.habitica.models.social.GroupMembership) r4
                        java.lang.String r4 = r4.getUserID()
                        r2.add(r4)
                        goto L47
                    L5b:
                        r6 = 0
                        java.lang.String[] r6 = new java.lang.String[r6]
                        java.lang.Object[] r6 = r2.toArray(r6)
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L6b
                        return r1
                    L6b:
                        dc.w r6 = dc.w.f13270a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembers$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super String[]> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        }, new RealmSocialLocalRepository$getGroupMembers$$inlined$flatMapLatest$1(null, this));
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public g<GroupMembership> getGroupMembership(String str, String str2) {
        q.i(str, TaskFormActivity.USER_ID_KEY);
        q.i(str2, "id");
        g1 p10 = getRealm().k1(GroupMembership.class).n("userID", str).n("groupID", str2).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        final g<g1<GroupMembership>> gVar = new g<g1<GroupMembership>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembership$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembership$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembership$$inlined$filter$1$2", f = "RealmSocialLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembership$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(h hVar) {
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
                        boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembership$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembership$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembership$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembership$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembership$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r7)
                        goto L54
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        dc.n.b(r7)
                        dd.h r7 = r5.$this_unsafeFlow
                        r2 = r6
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r4 = r2.isLoaded()
                        if (r4 == 0) goto L48
                        boolean r2 = r2.isEmpty()
                        r2 = r2 ^ r3
                        if (r2 == 0) goto L48
                        r2 = 1
                        goto L49
                    L48:
                        r2 = 0
                    L49:
                        if (r2 == 0) goto L54
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L54
                        return r1
                    L54:
                        dc.w r6 = dc.w.f13270a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembership$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<GroupMembership>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
        return new g<GroupMembership>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembership$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembership$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembership$$inlined$map$1$2", f = "RealmSocialLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembership$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
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

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembership$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembership$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembership$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembership$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembership$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        io.realm.g1 r5 = (io.realm.g1) r5
                        java.lang.Object r5 = r5.first()
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMembership$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super GroupMembership> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public g<List<GroupMembership>> getGroupMemberships(String str) {
        q.i(str, TaskFormActivity.USER_ID_KEY);
        g1 p10 = getRealm().k1(GroupMembership.class).n("userID", str).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return new g<g1<GroupMembership>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMemberships$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMemberships$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMemberships$$inlined$filter$1$2", f = "RealmSocialLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMemberships$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMemberships$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMemberships$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMemberships$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMemberships$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMemberships$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getGroupMemberships$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<GroupMembership>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public g<g1<InboxConversation>> getInboxConversation(String str) {
        q.i(str, TaskFormActivity.USER_ID_KEY);
        g1 p10 = getRealm().k1(InboxConversation.class).n("userID", str).J("timestamp", j1.DESCENDING).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return new g<g1<InboxConversation>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getInboxConversation$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getInboxConversation$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getInboxConversation$$inlined$filter$1$2", f = "RealmSocialLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getInboxConversation$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getInboxConversation$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getInboxConversation$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getInboxConversation$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getInboxConversation$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getInboxConversation$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getInboxConversation$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<InboxConversation>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public g<g1<ChatMessage>> getInboxMessages(String str, String str2) {
        q.i(str, TaskFormActivity.USER_ID_KEY);
        g1 p10 = getRealm().k1(ChatMessage.class).l("isInboxMessage", Boolean.TRUE).n("uuid", str2).n("userID", str).J("timestamp", j1.DESCENDING).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return new g<g1<ChatMessage>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getInboxMessages$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getInboxMessages$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getInboxMessages$$inlined$filter$1$2", f = "RealmSocialLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getInboxMessages$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getInboxMessages$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getInboxMessages$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getInboxMessages$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getInboxMessages$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getInboxMessages$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getInboxMessages$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<ChatMessage>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public g<Member> getMember(String str) {
        g1 p10 = getRealm().k1(Member.class).n("id", str).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        final g<g1<Member>> gVar = new g<g1<Member>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getMember$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getMember$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getMember$$inlined$filter$1$2", f = "RealmSocialLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getMember$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(h hVar) {
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
                        boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getMember$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getMember$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getMember$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getMember$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getMember$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r7)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        dc.n.b(r7)
                        dd.h r7 = r5.$this_unsafeFlow
                        r2 = r6
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r4 = r2.isLoaded()
                        if (r4 == 0) goto L47
                        boolean r2 = r2.isValid()
                        if (r2 == 0) goto L47
                        r2 = 1
                        goto L48
                    L47:
                        r2 = 0
                    L48:
                        if (r2 == 0) goto L53
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L53
                        return r1
                    L53:
                        dc.w r6 = dc.w.f13270a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getMember$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<Member>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
        return new g<Member>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getMember$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getMember$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getMember$$inlined$map$1$2", f = "RealmSocialLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getMember$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
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

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getMember$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getMember$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getMember$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getMember$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getMember$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        io.realm.g1 r5 = (io.realm.g1) r5
                        java.lang.Object r5 = ec.r.c0(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getMember$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super Member> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public g<g1<Member>> getPartyMembers(String str) {
        q.i(str, "partyId");
        g1 p10 = getRealm().k1(Member.class).n("party.id", str).p();
        q.h(p10, "findAll(...)");
        return ac.c.a(p10);
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public g<g1<Group>> getUserGroups(String str, String str2) {
        q.i(str, "userID");
        g1 p10 = getRealm().k1(GroupMembership.class).n("userID", str).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return i.R(new g<g1<GroupMembership>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getUserGroups$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getUserGroups$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getUserGroups$$inlined$filter$1$2", f = "RealmSocialLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getUserGroups$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getUserGroups$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getUserGroups$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getUserGroups$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getUserGroups$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getUserGroups$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository$getUserGroups$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<GroupMembership>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        }, new RealmSocialLocalRepository$getUserGroups$$inlined$flatMapLatest$1(null, this, str2));
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public void likeMessage(ChatMessage chatMessage, String str, boolean z10) {
        x0<ChatMessageLike> likes;
        boolean z11;
        q.i(chatMessage, "chatMessage");
        q.i(str, TaskFormActivity.USER_ID_KEY);
        if (chatMessage.userLikesMessage(str) == z10) {
            return;
        }
        ChatMessage chatMessage2 = (ChatMessage) getLiveObject(chatMessage);
        if (z10) {
            executeTransaction(new RealmSocialLocalRepository$likeMessage$1(chatMessage2, str));
            return;
        }
        if (chatMessage2 != null && (likes = chatMessage2.getLikes()) != null) {
            ArrayList arrayList = new ArrayList();
            for (ChatMessageLike chatMessageLike : likes) {
                ChatMessageLike chatMessageLike2 = chatMessageLike;
                if (q.d(str, chatMessageLike2.getId()) && chatMessageLike2.isManaged()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    arrayList.add(chatMessageLike);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                executeTransaction(new RealmSocialLocalRepository$likeMessage$3$1((ChatMessageLike) it.next()));
            }
        }
        executeTransaction(new RealmSocialLocalRepository$likeMessage$4(chatMessage2));
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public void rejectGroupInvitation(String str, String str2) {
        q.i(str, "userID");
        q.i(str2, "groupID");
        executeTransaction(new RealmSocialLocalRepository$rejectGroupInvitation$1((User) getRealm().k1(User.class).n("id", str).q(), str2));
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public void removeQuest(String str) {
        q.i(str, "partyId");
        Group group = (Group) getRealm().k1(Group.class).n("id", str).q();
        if (group != null) {
            executeTransaction(new RealmSocialLocalRepository$removeQuest$1(group));
        }
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public void saveChatMessages(String str, List<? extends ChatMessage> list) {
        q.i(list, "chatMessages");
        save(list);
        if (str != null) {
            g1 p10 = getRealm().k1(ChatMessage.class).n(TaskFormActivity.GROUP_ID_KEY, str).p();
            ArrayList arrayList = new ArrayList();
            Iterator it = p10.iterator();
            while (it.hasNext()) {
                ChatMessage chatMessage = (ChatMessage) it.next();
                List<? extends ChatMessage> list2 = list;
                boolean z10 = false;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (q.d(chatMessage.getId(), ((ChatMessage) it2.next()).getId())) {
                            z10 = true;
                            break;
                        }
                    }
                }
                if (!z10) {
                    arrayList.add(chatMessage);
                }
            }
            executeTransaction(new RealmSocialLocalRepository$saveChatMessages$1(arrayList));
        }
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public void saveGroup(Group group) {
        q.i(group, "group");
        save((RealmSocialLocalRepository) group);
        if (group.getQuest() == null) {
            executeTransaction(new RealmSocialLocalRepository$saveGroup$1((Quest) getRealm().k1(Quest.class).n("id", group.getId()).q()));
        }
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public void saveGroupMemberships(String str, List<? extends GroupMembership> list) {
        q.i(list, "memberships");
        save(list);
        if (str != null) {
            g1 p10 = getRealm().k1(GroupMembership.class).n("userID", str).p();
            ArrayList arrayList = new ArrayList();
            Iterator it = p10.iterator();
            while (it.hasNext()) {
                GroupMembership groupMembership = (GroupMembership) it.next();
                List<? extends GroupMembership> list2 = list;
                boolean z10 = false;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (q.d(groupMembership.getGroupID(), ((GroupMembership) it2.next()).getGroupID())) {
                            z10 = true;
                            break;
                        }
                    }
                }
                if (!z10) {
                    arrayList.add(groupMembership);
                }
            }
            executeTransaction(new RealmSocialLocalRepository$saveGroupMemberships$1(arrayList));
        }
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public void saveInboxConversations(String str, List<? extends InboxConversation> list) {
        q.i(str, "userID");
        q.i(list, "conversations");
        List<? extends InboxConversation> list2 = list;
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            ((InboxConversation) it.next()).setUserID(str);
        }
        save(list);
        g1 p10 = getRealm().k1(InboxConversation.class).p();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = p10.iterator();
        while (it2.hasNext()) {
            InboxConversation inboxConversation = (InboxConversation) it2.next();
            boolean z10 = false;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (q.d(inboxConversation.getUuid(), ((InboxConversation) it3.next()).getUuid())) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (!z10) {
                arrayList.add(inboxConversation);
            }
        }
        executeTransaction(new RealmSocialLocalRepository$saveInboxConversations$2(arrayList));
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public void saveInboxMessages(String str, String str2, List<? extends ChatMessage> list, int i10) {
        boolean z10;
        Object c02;
        q.i(str, "userID");
        q.i(str2, "recipientID");
        q.i(list, "messages");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ChatMessage) it.next()).setUserID(str);
        }
        Iterator<? extends ChatMessage> it2 = list.iterator();
        while (true) {
            boolean z11 = true;
            if (!it2.hasNext()) {
                break;
            }
            ChatMessage next = it2.next();
            g1 p10 = getRealm().k1(ChatMessage.class).n("id", next.getId()).p();
            q.h(p10, "findAll(...)");
            c02 = b0.c0(p10);
            if (((ChatMessage) c02) == null) {
                z11 = false;
            }
            next.setSeen(z11);
        }
        save(list);
        if (i10 != 0) {
            return;
        }
        g1 p11 = getRealm().k1(ChatMessage.class).l("isInboxMessage", Boolean.TRUE).n("uuid", str2).p();
        ArrayList arrayList = new ArrayList();
        Iterator it3 = p11.iterator();
        while (it3.hasNext()) {
            ChatMessage chatMessage = (ChatMessage) it3.next();
            List<? extends ChatMessage> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it4 = list2.iterator();
                while (it4.hasNext()) {
                    if (q.d(chatMessage.getId(), ((ChatMessage) it4.next()).getId())) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            if (!z10) {
                arrayList.add(chatMessage);
            }
        }
        executeTransaction(new RealmSocialLocalRepository$saveInboxMessages$2(arrayList));
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public void savePartyMembers(String str, List<? extends Member> list) {
        boolean z10;
        q.i(list, "members");
        save(list);
        if (str != null) {
            g1 p10 = getRealm().k1(Member.class).n("party.id", str).p();
            ArrayList arrayList = new ArrayList();
            Iterator it = p10.iterator();
            while (it.hasNext()) {
                Member member = (Member) it.next();
                List<? extends Member> list2 = list;
                boolean z11 = false;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Member member2 = (Member) it2.next();
                        if (member.getId() != null && q.d(member.getId(), member2.getId())) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            z11 = true;
                            break;
                        }
                    }
                }
                if (!z11) {
                    arrayList.add(member);
                }
            }
            executeTransaction(new RealmSocialLocalRepository$savePartyMembers$1(arrayList));
        }
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public void setQuestActivity(Group group, boolean z10) {
        if (group == null) {
            return;
        }
        executeTransaction(new RealmSocialLocalRepository$setQuestActivity$1((Group) getLiveObject(group), z10));
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public void updateMembership(String str, String str2, boolean z10) {
        q.i(str, TaskFormActivity.USER_ID_KEY);
        q.i(str2, "id");
        if (z10) {
            save((RealmSocialLocalRepository) new GroupMembership(str, str2));
            return;
        }
        GroupMembership groupMembership = (GroupMembership) getRealm().k1(GroupMembership.class).n("userID", str).n("groupID", str2).q();
        if (groupMembership != null) {
            executeTransaction(new RealmSocialLocalRepository$updateMembership$1(groupMembership));
        }
    }

    @Override // com.habitrpg.android.habitica.data.local.SocialLocalRepository
    public void updateRSVPNeeded(User user, boolean z10) {
        executeTransaction(new RealmSocialLocalRepository$updateRSVPNeeded$1(user, z10));
    }
}
