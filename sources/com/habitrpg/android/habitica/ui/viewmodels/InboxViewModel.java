package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import androidx.lifecycle.LiveData;
import androidx.paging.n1;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import dc.n;
import dc.w;
import dd.l0;
import dd.x;
import ic.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;

/* compiled from: InboxViewModel.kt */
/* loaded from: classes4.dex */
public final class InboxViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final n1.d config;
    private final MessagesDataSourceFactory dataSourceFactory;
    private final LiveData<Member> member;
    private x<String> memberIDFlow;
    private final l0<String> memberIDState;
    private final LiveData<n1<ChatMessage>> messages;
    private final String recipientID;
    private final String recipientUsername;
    private final SocialRepository socialRepository;

    /* compiled from: InboxViewModel.kt */
    @f(c = "com.habitrpg.android.habitica.ui.viewmodels.InboxViewModel$1", f = "InboxViewModel.kt", l = {76}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.InboxViewModel$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object d10 = b.d();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                SocialRepository socialRepository = InboxViewModel.this.getSocialRepository();
                String recipientUsername = InboxViewModel.this.getRecipientUsername();
                this.label = 1;
                obj = socialRepository.retrieveMember(recipientUsername, false, this);
                if (obj == d10) {
                    return d10;
                }
            }
            Member member = (Member) obj;
            InboxViewModel inboxViewModel = InboxViewModel.this;
            if (member == null || (str = member.getId()) == null) {
                str = "";
            }
            inboxViewModel.setMemberID(str);
            InboxViewModel.this.invalidateDataSource();
            InboxViewModel.this.dataSourceFactory.updateRecipientID(InboxViewModel.this.getMemberID());
            return w.f13270a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InboxViewModel(androidx.lifecycle.n0 r10, com.habitrpg.android.habitica.data.UserRepository r11, com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel r12, com.habitrpg.android.habitica.data.SocialRepository r13) {
        /*
            r9 = this;
            java.lang.String r0 = "savedStateHandle"
            qc.q.i(r10, r0)
            java.lang.String r0 = "userRepository"
            qc.q.i(r11, r0)
            java.lang.String r0 = "userViewModel"
            qc.q.i(r12, r0)
            java.lang.String r0 = "socialRepository"
            qc.q.i(r13, r0)
            r9.<init>(r11, r12)
            r9.socialRepository = r13
            java.lang.String r11 = "userID"
            java.lang.Object r11 = r10.f(r11)
            java.lang.String r11 = (java.lang.String) r11
            r9.recipientID = r11
            java.lang.String r12 = "username"
            java.lang.Object r10 = r10.f(r12)
            java.lang.String r10 = (java.lang.String) r10
            r9.recipientUsername = r10
            r12 = 0
            dd.x r0 = dd.n0.a(r12)
            r9.memberIDFlow = r0
            r9.memberIDState = r0
            androidx.paging.n1$d$a r0 = new androidx.paging.n1$d$a
            r0.<init>()
            r1 = 10
            androidx.paging.n1$d$a r0 = r0.c(r1)
            r1 = 0
            androidx.paging.n1$d$a r0 = r0.b(r1)
            androidx.paging.n1$d r3 = r0.a()
            r9.config = r3
            com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSourceFactory r2 = new com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSourceFactory
            com.habitrpg.android.habitica.models.social.ChatMessage r0 = new com.habitrpg.android.habitica.models.social.ChatMessage
            r0.<init>()
            r2.<init>(r13, r11, r0)
            r9.dataSourceFactory = r2
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 14
            r8 = 0
            androidx.lifecycle.LiveData r13 = androidx.paging.p0.b(r2, r3, r4, r5, r6, r7, r8)
            r9.messages = r13
            dd.x<java.lang.String> r13 = r9.memberIDFlow
            dd.g r13 = dd.i.u(r13)
            com.habitrpg.android.habitica.ui.viewmodels.InboxViewModel$special$$inlined$flatMapLatest$1 r0 = new com.habitrpg.android.habitica.ui.viewmodels.InboxViewModel$special$$inlined$flatMapLatest$1
            r0.<init>(r12, r9)
            dd.g r2 = dd.i.R(r13, r0)
            r3 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            androidx.lifecycle.LiveData r13 = androidx.lifecycle.m.c(r2, r3, r4, r6, r7)
            r9.member = r13
            r13 = 1
            if (r11 == 0) goto L8a
            boolean r0 = yc.m.u(r11)
            r0 = r0 ^ r13
            if (r0 != r13) goto L8a
            r0 = 1
            goto L8b
        L8a:
            r0 = 0
        L8b:
            if (r0 == 0) goto L91
            r9.setMemberID(r11)
            goto Lb2
        L91:
            if (r10 == 0) goto L9b
            boolean r10 = yc.m.u(r10)
            r10 = r10 ^ r13
            if (r10 != r13) goto L9b
            r1 = 1
        L9b:
            if (r1 == 0) goto Lb2
            ad.k0 r2 = androidx.lifecycle.w0.a(r9)
            com.habitrpg.common.habitica.helpers.ExceptionHandler$Companion r10 = com.habitrpg.common.habitica.helpers.ExceptionHandler.Companion
            ad.h0 r3 = com.habitrpg.common.habitica.helpers.ExceptionHandler.Companion.coroutine$default(r10, r12, r13, r12)
            r4 = 0
            com.habitrpg.android.habitica.ui.viewmodels.InboxViewModel$1 r5 = new com.habitrpg.android.habitica.ui.viewmodels.InboxViewModel$1
            r5.<init>(r12)
            r6 = 2
            r7 = 0
            ad.g.d(r2, r3, r4, r5, r6, r7)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.InboxViewModel.<init>(androidx.lifecycle.n0, com.habitrpg.android.habitica.data.UserRepository, com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel, com.habitrpg.android.habitica.data.SocialRepository):void");
    }

    public final LiveData<Member> getMemberData() {
        return this.member;
    }

    public final String getMemberID() {
        return this.memberIDFlow.getValue();
    }

    public final l0<String> getMemberIDState() {
        return this.memberIDState;
    }

    public final LiveData<n1<ChatMessage>> getMessages() {
        return this.messages;
    }

    public final String getRecipientID() {
        return this.recipientID;
    }

    public final String getRecipientUsername() {
        return this.recipientUsername;
    }

    public final SocialRepository getSocialRepository() {
        return this.socialRepository;
    }

    public final void invalidateDataSource() {
        MessagesDataSource f10 = this.dataSourceFactory.getSourceLiveData().f();
        if (f10 != null) {
            f10.invalidate();
        }
    }

    public final void setMemberID(String str) {
        q.i(str, "memberID");
        if (q.d(str, this.memberIDState.getValue())) {
            return;
        }
        this.memberIDFlow.setValue(str);
    }
}
