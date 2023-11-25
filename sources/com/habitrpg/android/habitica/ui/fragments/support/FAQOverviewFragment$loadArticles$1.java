package com.habitrpg.android.habitica.ui.fragments.support;

import ad.k0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.habitrpg.android.habitica.databinding.FragmentFaqOverviewBinding;
import com.habitrpg.android.habitica.databinding.SupportFaqItemBinding;
import com.habitrpg.android.habitica.models.FAQArticle;
import com.habitrpg.android.habitica.ui.fragments.support.FAQOverviewFragment$loadArticles$1;
import com.habitrpg.android.habitica.ui.fragments.support.FAQOverviewFragmentDirections;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.n;
import dc.w;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;

/* compiled from: FAQOverviewFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.support.FAQOverviewFragment$loadArticles$1", f = "FAQOverviewFragment.kt", l = {163}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FAQOverviewFragment$loadArticles$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ FAQOverviewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FAQOverviewFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.support.FAQOverviewFragment$loadArticles$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1<T> implements dd.h {
        final /* synthetic */ FAQOverviewFragment this$0;

        AnonymousClass1(FAQOverviewFragment fAQOverviewFragment) {
            this.this$0 = fAQOverviewFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void emit$lambda$0(FAQArticle fAQArticle, View view) {
            int i10;
            q.i(fAQArticle, "$article");
            FAQOverviewFragmentDirections.OpenFAQDetail openFAQDetail = FAQOverviewFragmentDirections.openFAQDetail(null, null);
            q.h(openFAQDetail, "openFAQDetail(...)");
            Integer position = fAQArticle.getPosition();
            if (position != null) {
                i10 = position.intValue();
            } else {
                i10 = 0;
            }
            openFAQDetail.setPosition(i10);
            MainNavigationController.INSTANCE.navigate(openFAQDetail);
        }

        @Override // dd.h
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((List) obj, (Continuation<? super w>) continuation);
        }

        public final Object emit(List<? extends FAQArticle> list, Continuation<? super w> continuation) {
            Context context = this.this$0.getContext();
            if (context == null) {
                return w.f13270a;
            }
            FragmentFaqOverviewBinding binding = this.this$0.getBinding();
            if ((binding != null ? binding.faqLinearLayout : null) == null) {
                return w.f13270a;
            }
            for (final FAQArticle fAQArticle : list) {
                LayoutInflater layoutInflater = ContextExtensionsKt.getLayoutInflater(context);
                FragmentFaqOverviewBinding binding2 = this.this$0.getBinding();
                SupportFaqItemBinding inflate = SupportFaqItemBinding.inflate(layoutInflater, binding2 != null ? binding2.faqLinearLayout : null, true);
                q.h(inflate, "inflate(...)");
                inflate.textView.setText(fAQArticle.getQuestion());
                inflate.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.support.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FAQOverviewFragment$loadArticles$1.AnonymousClass1.emit$lambda$0(FAQArticle.this, view);
                    }
                });
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FAQOverviewFragment$loadArticles$1(FAQOverviewFragment fAQOverviewFragment, Continuation<? super FAQOverviewFragment$loadArticles$1> continuation) {
        super(2, continuation);
        this.this$0 = fAQOverviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new FAQOverviewFragment$loadArticles$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((FAQOverviewFragment$loadArticles$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            dd.g<List<FAQArticle>> articles = this.this$0.getFaqRepository().getArticles();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (articles.collect(anonymousClass1, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
