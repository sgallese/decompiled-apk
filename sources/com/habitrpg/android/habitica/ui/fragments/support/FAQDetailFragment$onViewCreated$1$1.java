package com.habitrpg.android.habitica.ui.fragments.support;

import ad.k0;
import android.widget.TextView;
import com.habitrpg.android.habitica.databinding.FragmentFaqDetailBinding;
import com.habitrpg.android.habitica.models.FAQArticle;
import com.habitrpg.common.habitica.helpers.MarkdownParser;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: FAQDetailFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.support.FAQDetailFragment$onViewCreated$1$1", f = "FAQDetailFragment.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FAQDetailFragment$onViewCreated$1$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ FAQDetailFragmentArgs $args;
    int label;
    final /* synthetic */ FAQDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FAQDetailFragment$onViewCreated$1$1(FAQDetailFragment fAQDetailFragment, FAQDetailFragmentArgs fAQDetailFragmentArgs, Continuation<? super FAQDetailFragment$onViewCreated$1$1> continuation) {
        super(2, continuation);
        this.this$0 = fAQDetailFragment;
        this.$args = fAQDetailFragmentArgs;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new FAQDetailFragment$onViewCreated$1$1(this.this$0, this.$args, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((FAQDetailFragment$onViewCreated$1$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            dd.g<FAQArticle> article = this.this$0.getFaqRepository().getArticle(this.$args.getPosition());
            final FAQDetailFragment fAQDetailFragment = this.this$0;
            dd.h<? super FAQArticle> hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.fragments.support.FAQDetailFragment$onViewCreated$1$1.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((FAQArticle) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(FAQArticle fAQArticle, Continuation<? super w> continuation) {
                    FragmentFaqDetailBinding binding = FAQDetailFragment.this.getBinding();
                    TextView textView = binding != null ? binding.questionTextView : null;
                    if (textView != null) {
                        textView.setText(fAQArticle.getQuestion());
                    }
                    FragmentFaqDetailBinding binding2 = FAQDetailFragment.this.getBinding();
                    TextView textView2 = binding2 != null ? binding2.answerTextView : null;
                    if (textView2 != null) {
                        textView2.setText(MarkdownParser.INSTANCE.parseMarkdown(fAQArticle.getAnswer()));
                    }
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (article.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
