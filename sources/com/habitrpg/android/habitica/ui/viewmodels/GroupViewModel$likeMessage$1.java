package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import androidx.lifecycle.f0;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import dc.n;
import dc.w;
import ec.b0;
import ic.d;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GroupViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$likeMessage$1", f = "GroupViewModel.kt", l = {221}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GroupViewModel$likeMessage$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ ChatMessage $message;
    int label;
    final /* synthetic */ GroupViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GroupViewModel.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$likeMessage$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends r implements pc.a<w> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupViewModel$likeMessage$1(GroupViewModel groupViewModel, ChatMessage chatMessage, Continuation<? super GroupViewModel$likeMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = groupViewModel;
        this.$message = chatMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new GroupViewModel$likeMessage$1(this.this$0, this.$message, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((GroupViewModel$likeMessage$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        f0 f0Var;
        Integer num;
        f0 f0Var2;
        f0 f0Var3;
        String str;
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
            SocialRepository socialRepository = this.this$0.getSocialRepository();
            ChatMessage chatMessage = this.$message;
            this.label = 1;
            obj = socialRepository.likeMessage(chatMessage, this);
            if (obj == d10) {
                return d10;
            }
        }
        ChatMessage chatMessage2 = (ChatMessage) obj;
        f0Var = this.this$0.get_chatMessages();
        List list = (List) f0Var.f();
        List list2 = null;
        if (list != null) {
            Iterator it = list.iterator();
            int i11 = 0;
            while (true) {
                if (it.hasNext()) {
                    String id2 = ((ChatMessage) it.next()).getId();
                    if (chatMessage2 != null) {
                        str = chatMessage2.getId();
                    } else {
                        str = null;
                    }
                    if (q.d(id2, str)) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            num = b.d(i11);
        } else {
            num = null;
        }
        if (num != null && num.intValue() >= 0) {
            f0Var2 = this.this$0.get_chatMessages();
            List list3 = (List) f0Var2.f();
            if (list3 != null) {
                list2 = b0.F0(list3);
            }
            if (chatMessage2 != null && list2 != null) {
                ChatMessage chatMessage3 = (ChatMessage) list2.set(num.intValue(), chatMessage2);
            }
            f0Var3 = this.this$0.get_chatMessages();
            f0Var3.n(list2);
            return w.f13270a;
        }
        this.this$0.retrieveGroupChat(AnonymousClass1.INSTANCE);
        return w.f13270a;
    }
}
