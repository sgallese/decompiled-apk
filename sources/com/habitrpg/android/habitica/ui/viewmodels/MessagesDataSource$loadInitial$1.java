package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import androidx.paging.a2;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import dd.i;
import ec.b0;
import ic.d;
import io.realm.g1;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;

/* compiled from: InboxViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSource$loadInitial$1", f = "InboxViewModel.kt", l = {128}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MessagesDataSource$loadInitial$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ a2.b<ChatMessage> $callback;
    int label;
    final /* synthetic */ MessagesDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesDataSource$loadInitial$1(MessagesDataSource messagesDataSource, a2.b<ChatMessage> bVar, Continuation<? super MessagesDataSource$loadInitial$1> continuation) {
        super(2, continuation);
        this.this$0 = messagesDataSource;
        this.$callback = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new MessagesDataSource$loadInitial$1(this.this$0, this.$callback, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((MessagesDataSource$loadInitial$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            final g<g1<ChatMessage>> inboxMessages = this.this$0.getSocialRepository().getInboxMessages(this.this$0.getRecipientID());
            final MessagesDataSource messagesDataSource = this.this$0;
            g R = i.R(i.P(new g<List<? extends ChatMessage>>() { // from class: com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSource$loadInitial$1$invokeSuspend$$inlined$map$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSource$loadInitial$1$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements h {
                    final /* synthetic */ h $this_unsafeFlow;
                    final /* synthetic */ MessagesDataSource this$0;

                    /* compiled from: Emitters.kt */
                    @f(c = "com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSource$loadInitial$1$invokeSuspend$$inlined$map$1$2", f = "InboxViewModel.kt", l = {223}, m = "emit")
                    /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSource$loadInitial$1$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
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

                    public AnonymousClass2(h hVar, MessagesDataSource messagesDataSource) {
                        this.$this_unsafeFlow = hVar;
                        this.this$0 = messagesDataSource;
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
                            boolean r0 = r6 instanceof com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSource$loadInitial$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSource$loadInitial$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSource$loadInitial$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSource$loadInitial$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSource$loadInitial$1$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            java.lang.Object r1 = ic.b.d()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            dc.n.b(r6)
                            goto L4b
                        L29:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L31:
                            dc.n.b(r6)
                            dd.h r6 = r4.$this_unsafeFlow
                            io.realm.g1 r5 = (io.realm.g1) r5
                            com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSource r2 = r4.this$0
                            com.habitrpg.android.habitica.data.SocialRepository r2 = r2.getSocialRepository()
                            java.util.List r5 = r2.getUnmanagedCopy(r5)
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L4b
                            return r1
                        L4b:
                            dc.w r5 = dc.w.f13270a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSource$loadInitial$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // dd.g
                public Object collect(h<? super List<? extends ChatMessage>> hVar, Continuation continuation) {
                    Object d11;
                    Object collect = g.this.collect(new AnonymousClass2(hVar, messagesDataSource), continuation);
                    d11 = d.d();
                    if (collect == d11) {
                        return collect;
                    }
                    return w.f13270a;
                }
            }, 1), new MessagesDataSource$loadInitial$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0));
            final MessagesDataSource messagesDataSource2 = this.this$0;
            final a2.b<ChatMessage> bVar = this.$callback;
            h hVar = new h() { // from class: com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSource$loadInitial$1.3
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(List<? extends ChatMessage> list, Continuation<? super w> continuation) {
                    List<? extends ChatMessage> s02;
                    if (list.size() < 10 && MessagesDataSource.this.getFooter() != null) {
                        a2.b<ChatMessage> bVar2 = bVar;
                        ChatMessage footer = MessagesDataSource.this.getFooter();
                        q.f(footer);
                        s02 = b0.s0(list, footer);
                        bVar2.a(s02, 0);
                    } else {
                        bVar.a(list, 0);
                    }
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (R.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
