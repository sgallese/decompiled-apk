package com.habitrpg.android.habitica.ui.viewHolders.tasks;

import ad.a1;
import ad.i2;
import ad.k0;
import android.text.Spanned;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.ui.views.EllipsisTextView;
import com.habitrpg.common.habitica.helpers.MarkdownParser;
import com.habitrpg.common.habitica.helpers.MarkdownParserKt;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseTaskViewHolder.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder$bind$2$1", f = "BaseTaskViewHolder.kt", l = {181}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class BaseTaskViewHolder$bind$2$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Task $data;
    final /* synthetic */ String $notes;
    int label;
    final /* synthetic */ BaseTaskViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseTaskViewHolder.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder$bind$2$1$1", f = "BaseTaskViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder$bind$2$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ Task $data;
        final /* synthetic */ Spanned $parsedNotes;
        int label;
        final /* synthetic */ BaseTaskViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Task task, Spanned spanned, BaseTaskViewHolder baseTaskViewHolder, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$data = task;
            this.$parsedNotes = spanned;
            this.this$0 = baseTaskViewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$data, this.$parsedNotes, this.this$0, continuation);
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
                this.$data.setParsedNotes(this.$parsedNotes);
                EllipsisTextView notesTextView = this.this$0.getNotesTextView();
                if (notesTextView != null) {
                    MarkdownParserKt.setParsedMarkdown(notesTextView, this.$parsedNotes);
                }
                return w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTaskViewHolder$bind$2$1(String str, Task task, BaseTaskViewHolder baseTaskViewHolder, Continuation<? super BaseTaskViewHolder$bind$2$1> continuation) {
        super(2, continuation);
        this.$notes = str;
        this.$data = task;
        this.this$0 = baseTaskViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new BaseTaskViewHolder$bind$2$1(this.$notes, this.$data, this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((BaseTaskViewHolder$bind$2$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        boolean z10;
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
            if (this.$notes.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                MarkdownParser markdownParser = MarkdownParser.INSTANCE;
                if (markdownParser.containsMarkdown(this.$notes)) {
                    Spanned parseMarkdown = markdownParser.parseMarkdown(this.$notes);
                    i2 c10 = a1.c();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$data, parseMarkdown, this.this$0, null);
                    this.label = 1;
                    if (ad.g.g(c10, anonymousClass1, this) == d10) {
                        return d10;
                    }
                }
            }
            return w.f13270a;
        }
        return w.f13270a;
    }
}
