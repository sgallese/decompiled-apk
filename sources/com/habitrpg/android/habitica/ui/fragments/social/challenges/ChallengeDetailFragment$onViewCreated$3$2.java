package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import ad.k0;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.databinding.FragmentChallengeDetailBinding;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import dc.n;
import dc.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import pc.p;

/* compiled from: ChallengeDetailFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$2", f = "ChallengeDetailFragment.kt", l = {110}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ChallengeDetailFragment$onViewCreated$3$2 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ ChallengeDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailFragment$onViewCreated$3$2(ChallengeDetailFragment challengeDetailFragment, String str, Continuation<? super ChallengeDetailFragment$onViewCreated$3$2> continuation) {
        super(2, continuation);
        this.this$0 = challengeDetailFragment;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ChallengeDetailFragment$onViewCreated$3$2(this.this$0, this.$id, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ChallengeDetailFragment$onViewCreated$3$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            dd.g<List<Task>> challengeTasks = this.this$0.getChallengeRepository().getChallengeTasks(this.$id);
            final ChallengeDetailFragment challengeDetailFragment = this.this$0;
            dd.h<? super List<Task>> hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$2.1

                /* compiled from: ChallengeDetailFragment.kt */
                /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$2$1$WhenMappings */
                /* loaded from: classes4.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[TaskType.values().length];
                        try {
                            iArr[TaskType.TODO.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[TaskType.HABIT.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[TaskType.DAILY.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[TaskType.REWARD.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(List<? extends Task> list, Continuation<? super w> continuation) {
                    LinearLayout linearLayout;
                    FragmentChallengeDetailBinding binding = ChallengeDetailFragment.this.getBinding();
                    if (binding != null && (linearLayout = binding.taskGroupLayout) != null) {
                        linearLayout.removeAllViewsInLayout();
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    for (Task task : list) {
                        TaskType type = task.getType();
                        if (type != null) {
                            int i11 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                            if (i11 == 1) {
                                arrayList.add(task);
                            } else if (i11 == 2) {
                                arrayList2.add(task);
                            } else if (i11 == 3) {
                                arrayList3.add(task);
                            } else if (i11 == 4) {
                                arrayList4.add(task);
                            }
                        }
                    }
                    if (arrayList2.size() > 0) {
                        ChallengeDetailFragment.this.addHabits(arrayList2);
                    }
                    if (arrayList3.size() > 0) {
                        ChallengeDetailFragment.this.addDailys(arrayList3);
                    }
                    if (arrayList.size() > 0) {
                        ChallengeDetailFragment.this.addTodos(arrayList);
                    }
                    if (arrayList4.size() > 0) {
                        ChallengeDetailFragment.this.addRewards(arrayList4);
                    }
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (challengeTasks.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
