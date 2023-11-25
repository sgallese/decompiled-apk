package com.habitrpg.android.habitica.ui.viewHolders;

import ad.a1;
import ad.i2;
import ad.k0;
import android.text.Spanned;
import android.widget.TextView;
import androidx.recyclerview.widget.m;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.common.habitica.helpers.MarkdownParser;
import com.habitrpg.common.habitica.helpers.MarkdownParserKt;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatRecyclerViewHolder.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.viewHolders.ChatRecyclerMessageViewHolder$bind$2", f = "ChatRecyclerViewHolder.kt", l = {m.e.DEFAULT_DRAG_ANIMATION_DURATION}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ChatRecyclerMessageViewHolder$bind$2 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ ChatRecyclerMessageViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatRecyclerViewHolder.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.viewHolders.ChatRecyclerMessageViewHolder$bind$2$1", f = "ChatRecyclerViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.viewHolders.ChatRecyclerMessageViewHolder$bind$2$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ Spanned $parsedText;
        int label;
        final /* synthetic */ ChatRecyclerMessageViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatRecyclerMessageViewHolder chatRecyclerMessageViewHolder, Spanned spanned, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chatRecyclerMessageViewHolder;
            this.$parsedText = spanned;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$parsedText, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ChatMessage chatMessage;
            ic.d.d();
            if (this.label == 0) {
                dc.n.b(obj);
                chatMessage = this.this$0.chatMessage;
                if (chatMessage != null) {
                    chatMessage.setParsedText(this.$parsedText);
                }
                TextView textView = this.this$0.getBinding().messageText;
                q.h(textView, "messageText");
                MarkdownParserKt.setParsedMarkdown(textView, this.$parsedText);
                return w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRecyclerMessageViewHolder$bind$2(ChatRecyclerMessageViewHolder chatRecyclerMessageViewHolder, Continuation<? super ChatRecyclerMessageViewHolder$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = chatRecyclerMessageViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ChatRecyclerMessageViewHolder$bind$2(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ChatRecyclerMessageViewHolder$bind$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        ChatMessage chatMessage;
        String str;
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
            MarkdownParser markdownParser = MarkdownParser.INSTANCE;
            chatMessage = this.this$0.chatMessage;
            if (chatMessage == null || (str = chatMessage.getText()) == null) {
                str = "";
            }
            Spanned parseMarkdown = markdownParser.parseMarkdown(str);
            i2 c10 = a1.c();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, parseMarkdown, null);
            this.label = 1;
            if (ad.g.g(c10, anonymousClass1, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
