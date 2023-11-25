package com.habitrpg.android.habitica.ui.viewHolders.tasks;

import ad.a1;
import ad.i2;
import ad.k0;
import android.text.Spanned;
import android.widget.TextView;
import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.common.habitica.helpers.MarkdownParser;
import com.habitrpg.common.habitica.helpers.MarkdownParserKt;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: ChecklistedViewHolder.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.viewHolders.tasks.ChecklistedViewHolder$updateChecklistDisplay$1", f = "ChecklistedViewHolder.kt", l = {139}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ChecklistedViewHolder$updateChecklistDisplay$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ ChecklistItem $item;
    final /* synthetic */ TextView $textView;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChecklistedViewHolder.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.viewHolders.tasks.ChecklistedViewHolder$updateChecklistDisplay$1$1", f = "ChecklistedViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.viewHolders.tasks.ChecklistedViewHolder$updateChecklistDisplay$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ Spanned $parsedText;
        final /* synthetic */ TextView $textView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextView textView, Spanned spanned, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$textView = textView;
            this.$parsedText = spanned;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$textView, this.$parsedText, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.label == 0) {
                n.b(obj);
                TextView textView = this.$textView;
                if (textView != null) {
                    MarkdownParserKt.setParsedMarkdown(textView, this.$parsedText);
                }
                return w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChecklistedViewHolder$updateChecklistDisplay$1(ChecklistItem checklistItem, TextView textView, Continuation<? super ChecklistedViewHolder$updateChecklistDisplay$1> continuation) {
        super(2, continuation);
        this.$item = checklistItem;
        this.$textView = textView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ChecklistedViewHolder$updateChecklistDisplay$1(this.$item, this.$textView, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ChecklistedViewHolder$updateChecklistDisplay$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            MarkdownParser markdownParser = MarkdownParser.INSTANCE;
            String text = this.$item.getText();
            if (text == null) {
                text = "";
            }
            Spanned parseMarkdown = markdownParser.parseMarkdown(text);
            i2 c10 = a1.c();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$textView, parseMarkdown, null);
            this.label = 1;
            if (ad.g.g(c10, anonymousClass1, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
