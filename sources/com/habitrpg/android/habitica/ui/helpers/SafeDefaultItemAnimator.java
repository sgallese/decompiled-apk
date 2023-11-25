package com.habitrpg.android.habitica.ui.helpers;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;
import com.habitrpg.shared.habitica.HLogger;
import com.habitrpg.shared.habitica.LogLevel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qc.h;
import qc.q;
import vc.l;

/* compiled from: SafeDefaultItemAnimator.kt */
/* loaded from: classes4.dex */
public final class SafeDefaultItemAnimator extends y {
    private static final boolean DEBUG = false;
    private static TimeInterpolator sDefaultInterpolator;
    private boolean skipAnimations;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final ArrayList<RecyclerView.f0> pendingRemovals = new ArrayList<>();
    private final ArrayList<RecyclerView.f0> pendingAdditions = new ArrayList<>();
    private final ArrayList<MoveInfo> pendingMoves = new ArrayList<>();
    private final ArrayList<ChangeInfo> pendingChanges = new ArrayList<>();
    private final ArrayList<ArrayList<RecyclerView.f0>> additionsList = new ArrayList<>();
    private final ArrayList<ArrayList<MoveInfo>> movesList = new ArrayList<>();
    private final ArrayList<ArrayList<ChangeInfo>> changesList = new ArrayList<>();
    private final ArrayList<RecyclerView.f0> addAnimations = new ArrayList<>();
    private final ArrayList<RecyclerView.f0> moveAnimations = new ArrayList<>();
    private final ArrayList<RecyclerView.f0> removeAnimations = new ArrayList<>();
    private final ArrayList<RecyclerView.f0> changeAnimations = new ArrayList<>();

    /* compiled from: SafeDefaultItemAnimator.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SafeDefaultItemAnimator.kt */
    /* loaded from: classes4.dex */
    public static final class MoveInfo {
        private int fromX;
        private int fromY;
        private RecyclerView.f0 holder;
        private int toX;
        private int toY;

        public MoveInfo(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13) {
            this.holder = f0Var;
            this.fromX = i10;
            this.fromY = i11;
            this.toX = i12;
            this.toY = i13;
        }

        public final int getFromX() {
            return this.fromX;
        }

        public final int getFromY() {
            return this.fromY;
        }

        public final RecyclerView.f0 getHolder() {
            return this.holder;
        }

        public final int getToX() {
            return this.toX;
        }

        public final int getToY() {
            return this.toY;
        }

        public final void setFromX(int i10) {
            this.fromX = i10;
        }

        public final void setFromY(int i10) {
            this.fromY = i10;
        }

        public final void setHolder(RecyclerView.f0 f0Var) {
            this.holder = f0Var;
        }

        public final void setToX(int i10) {
            this.toX = i10;
        }

        public final void setToY(int i10) {
            this.toY = i10;
        }
    }

    private final void animateAddImpl(final RecyclerView.f0 f0Var) {
        final View view = f0Var.itemView;
        q.h(view, "itemView");
        final ViewPropertyAnimator animate = view.animate();
        this.addAnimations.add(f0Var);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new AnimatorListenerAdapter() { // from class: com.habitrpg.android.habitica.ui.helpers.SafeDefaultItemAnimator$animateAddImpl$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                q.i(animator, "animator");
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ArrayList arrayList;
                q.i(animator, "animator");
                animate.setListener(null);
                SafeDefaultItemAnimator.this.dispatchAddFinished(f0Var);
                arrayList = SafeDefaultItemAnimator.this.addAnimations;
                arrayList.remove(f0Var);
                SafeDefaultItemAnimator.this.dispatchFinishedWhenDone();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                q.i(animator, "animator");
                SafeDefaultItemAnimator.this.dispatchAddStarting(f0Var);
            }
        }).start();
    }

    private final void animateChangeImpl(final ChangeInfo changeInfo) {
        final View view;
        RecyclerView.f0 oldHolder = changeInfo.getOldHolder();
        final View view2 = null;
        if (oldHolder != null) {
            view = oldHolder.itemView;
        } else {
            view = null;
        }
        RecyclerView.f0 newHolder = changeInfo.getNewHolder();
        if (newHolder != null) {
            view2 = newHolder.itemView;
        }
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            q.h(duration, "setDuration(...)");
            RecyclerView.f0 oldHolder2 = changeInfo.getOldHolder();
            if (oldHolder2 != null) {
                this.changeAnimations.add(oldHolder2);
            }
            duration.translationX(changeInfo.getToX() - changeInfo.getFromX());
            duration.translationY(changeInfo.getToY() - changeInfo.getFromY());
            duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.habitrpg.android.habitica.ui.helpers.SafeDefaultItemAnimator$animateChangeImpl$2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    ArrayList arrayList;
                    q.i(animator, "animator");
                    duration.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    SafeDefaultItemAnimator.this.dispatchChangeFinished(changeInfo.getOldHolder(), true);
                    RecyclerView.f0 oldHolder3 = changeInfo.getOldHolder();
                    if (oldHolder3 != null) {
                        arrayList = SafeDefaultItemAnimator.this.changeAnimations;
                        arrayList.add(oldHolder3);
                    }
                    SafeDefaultItemAnimator.this.dispatchFinishedWhenDone();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    q.i(animator, "animator");
                    SafeDefaultItemAnimator.this.dispatchChangeStarting(changeInfo.getOldHolder(), true);
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator animate = view2.animate();
            RecyclerView.f0 newHolder2 = changeInfo.getNewHolder();
            if (newHolder2 != null) {
                this.changeAnimations.add(newHolder2);
            }
            animate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: com.habitrpg.android.habitica.ui.helpers.SafeDefaultItemAnimator$animateChangeImpl$4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    ArrayList arrayList;
                    q.i(animator, "animator");
                    animate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    SafeDefaultItemAnimator.this.dispatchChangeFinished(changeInfo.getNewHolder(), false);
                    RecyclerView.f0 newHolder3 = changeInfo.getNewHolder();
                    if (newHolder3 != null) {
                        arrayList = SafeDefaultItemAnimator.this.changeAnimations;
                        arrayList.add(newHolder3);
                    }
                    SafeDefaultItemAnimator.this.dispatchFinishedWhenDone();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    q.i(animator, "animator");
                    SafeDefaultItemAnimator.this.dispatchChangeStarting(changeInfo.getNewHolder(), false);
                }
            }).start();
        }
    }

    private final void animateMoveImpl(final RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13) {
        final View view = f0Var.itemView;
        q.h(view, "itemView");
        final int i14 = i12 - i10;
        final int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        HLogger.Companion companion = HLogger.Companion;
        LogLevel logLevel = LogLevel.INFO;
        companion.log(logLevel, "Moving", i12 + ", " + i10 + ", " + i14);
        companion.log(logLevel, "Moving", i12 + ", " + i10 + ", " + i14);
        final ViewPropertyAnimator animate = view.animate();
        this.moveAnimations.add(f0Var);
        animate.setDuration(getMoveDuration()).setListener(new AnimatorListenerAdapter() { // from class: com.habitrpg.android.habitica.ui.helpers.SafeDefaultItemAnimator$animateMoveImpl$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                q.i(animator, "animator");
                if (i14 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i15 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ArrayList arrayList;
                q.i(animator, "animator");
                animate.setListener(null);
                SafeDefaultItemAnimator.this.dispatchMoveFinished(f0Var);
                arrayList = SafeDefaultItemAnimator.this.moveAnimations;
                arrayList.remove(f0Var);
                SafeDefaultItemAnimator.this.dispatchFinishedWhenDone();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                q.i(animator, "animator");
                SafeDefaultItemAnimator.this.dispatchMoveStarting(f0Var);
            }
        }).start();
    }

    private final void animateRemoveImpl(final RecyclerView.f0 f0Var) {
        final View view = f0Var.itemView;
        q.h(view, "itemView");
        final ViewPropertyAnimator animate = view.animate();
        this.removeAnimations.add(f0Var);
        animate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.habitrpg.android.habitica.ui.helpers.SafeDefaultItemAnimator$animateRemoveImpl$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ArrayList arrayList;
                q.i(animator, "animator");
                animate.setListener(null);
                view.setAlpha(1.0f);
                SafeDefaultItemAnimator.this.dispatchRemoveFinished(f0Var);
                arrayList = SafeDefaultItemAnimator.this.removeAnimations;
                arrayList.remove(f0Var);
                SafeDefaultItemAnimator.this.dispatchFinishedWhenDone();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                q.i(animator, "animator");
                SafeDefaultItemAnimator.this.dispatchRemoveStarting(f0Var);
            }
        }).start();
    }

    private final void cancelAll(List<? extends RecyclerView.f0> list) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i10 = size - 1;
            list.get(size).itemView.animate().cancel();
            if (i10 >= 0) {
                size = i10;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchFinishedWhenDone() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    private final void endChangeAnimation(List<ChangeInfo> list, RecyclerView.f0 f0Var) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i10 = size - 1;
            ChangeInfo changeInfo = list.get(size);
            if (endChangeAnimationIfNecessary(changeInfo, f0Var) && changeInfo.getOldHolder() == null && changeInfo.getNewHolder() == null) {
                list.remove(changeInfo);
            }
            if (i10 >= 0) {
                size = i10;
            } else {
                return;
            }
        }
    }

    private final void endChangeAnimationIfNecessary(ChangeInfo changeInfo) {
        if (changeInfo.getOldHolder() != null) {
            endChangeAnimationIfNecessary(changeInfo, changeInfo.getOldHolder());
        }
        if (changeInfo.getNewHolder() != null) {
            endChangeAnimationIfNecessary(changeInfo, changeInfo.getNewHolder());
        }
    }

    private final void resetAnimation(RecyclerView.f0 f0Var) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        f0Var.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(f0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runPendingAnimations$lambda$1(ArrayList arrayList, SafeDefaultItemAnimator safeDefaultItemAnimator) {
        q.i(arrayList, "$moves");
        q.i(safeDefaultItemAnimator, "this$0");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MoveInfo moveInfo = (MoveInfo) it.next();
            RecyclerView.f0 holder = moveInfo.getHolder();
            if (holder != null) {
                safeDefaultItemAnimator.animateMoveImpl(holder, moveInfo.getFromX(), moveInfo.getFromY(), moveInfo.getToX(), moveInfo.getToY());
            }
        }
        arrayList.clear();
        safeDefaultItemAnimator.movesList.remove(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runPendingAnimations$lambda$2(ArrayList arrayList, SafeDefaultItemAnimator safeDefaultItemAnimator) {
        q.i(arrayList, "$changes");
        q.i(safeDefaultItemAnimator, "this$0");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ChangeInfo changeInfo = (ChangeInfo) it.next();
            q.f(changeInfo);
            safeDefaultItemAnimator.animateChangeImpl(changeInfo);
        }
        arrayList.clear();
        safeDefaultItemAnimator.changesList.remove(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runPendingAnimations$lambda$3(ArrayList arrayList, SafeDefaultItemAnimator safeDefaultItemAnimator) {
        q.i(arrayList, "$additions");
        q.i(safeDefaultItemAnimator, "this$0");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RecyclerView.f0 f0Var = (RecyclerView.f0) it.next();
            q.f(f0Var);
            safeDefaultItemAnimator.animateAddImpl(f0Var);
        }
        arrayList.clear();
        safeDefaultItemAnimator.additionsList.remove(arrayList);
    }

    @Override // androidx.recyclerview.widget.y
    public boolean animateAdd(RecyclerView.f0 f0Var) {
        q.i(f0Var, "holder");
        resetAnimation(f0Var);
        f0Var.itemView.setAlpha(0.0f);
        this.pendingAdditions.add(f0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.y
    public boolean animateChange(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i10, int i11, int i12, int i13) {
        q.i(f0Var, "oldHolder");
        if (f0Var == f0Var2) {
            return animateMove(f0Var, i10, i11, i12, i13);
        }
        float translationX = f0Var.itemView.getTranslationX();
        float translationY = f0Var.itemView.getTranslationY();
        float alpha = f0Var.itemView.getAlpha();
        resetAnimation(f0Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        f0Var.itemView.setTranslationX(translationX);
        f0Var.itemView.setTranslationY(translationY);
        f0Var.itemView.setAlpha(alpha);
        if (f0Var2 != null) {
            resetAnimation(f0Var2);
            f0Var2.itemView.setTranslationX(-i14);
            f0Var2.itemView.setTranslationY(-i15);
            f0Var2.itemView.setAlpha(0.0f);
        }
        HLogger.Companion companion = HLogger.Companion;
        LogLevel logLevel = LogLevel.INFO;
        companion.log(logLevel, "Changing", i12 + ", " + i10 + ", " + i14);
        companion.log(logLevel, "Changing", i12 + ", " + i10 + ", " + i14);
        if (f0Var2 != null) {
            this.pendingChanges.add(new ChangeInfo(f0Var, f0Var2, i10, i11, i12, i13));
            return true;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.y
    public boolean animateMove(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13) {
        q.i(f0Var, "holder");
        View view = f0Var.itemView;
        q.h(view, "itemView");
        int translationX = i10 + ((int) f0Var.itemView.getTranslationX());
        int translationY = i11 + ((int) f0Var.itemView.getTranslationY());
        resetAnimation(f0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            dispatchMoveFinished(f0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        HLogger.Companion companion = HLogger.Companion;
        LogLevel logLevel = LogLevel.INFO;
        companion.log(logLevel, "Moving1", i12 + ", " + i10 + ", " + i14);
        companion.log(logLevel, "Moving1", i12 + ", " + i10 + ", " + i14);
        this.pendingMoves.add(new MoveInfo(f0Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.y
    public boolean animateRemove(RecyclerView.f0 f0Var) {
        q.i(f0Var, "holder");
        resetAnimation(f0Var);
        this.pendingRemovals.add(f0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean canReuseUpdatedViewHolder(RecyclerView.f0 f0Var, List<? extends Object> list) {
        q.i(f0Var, "viewHolder");
        q.i(list, "payloads");
        if ((!list.isEmpty()) != false || super.canReuseUpdatedViewHolder(f0Var, list)) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void endAnimation(RecyclerView.f0 f0Var) {
        q.i(f0Var, "item");
        View view = f0Var.itemView;
        q.h(view, "itemView");
        view.animate().cancel();
        int size = this.pendingMoves.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                MoveInfo moveInfo = this.pendingMoves.get(size);
                q.h(moveInfo, "get(...)");
                if (moveInfo.getHolder() == f0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(f0Var);
                    this.pendingMoves.remove(size);
                }
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
        }
        endChangeAnimation(this.pendingChanges, f0Var);
        if (this.pendingRemovals.remove(f0Var)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(f0Var);
        }
        if (this.pendingAdditions.remove(f0Var)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(f0Var);
        }
        int size2 = this.changesList.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i11 = size2 - 1;
                ArrayList<ChangeInfo> arrayList = this.changesList.get(size2);
                q.h(arrayList, "get(...)");
                ArrayList<ChangeInfo> arrayList2 = arrayList;
                endChangeAnimation(arrayList2, f0Var);
                if (arrayList2.isEmpty()) {
                    this.changesList.remove(size2);
                }
                if (i11 < 0) {
                    break;
                }
                size2 = i11;
            }
        }
        int size3 = this.movesList.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i12 = size3 - 1;
                ArrayList<MoveInfo> arrayList3 = this.movesList.get(size3);
                q.h(arrayList3, "get(...)");
                ArrayList<MoveInfo> arrayList4 = arrayList3;
                int size4 = arrayList4.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i13 = size4 - 1;
                        MoveInfo moveInfo2 = arrayList4.get(size4);
                        q.h(moveInfo2, "get(...)");
                        if (moveInfo2.getHolder() == f0Var) {
                            view.setTranslationY(0.0f);
                            view.setTranslationX(0.0f);
                            dispatchMoveFinished(f0Var);
                            arrayList4.remove(size4);
                            if (arrayList4.isEmpty()) {
                                this.movesList.remove(size3);
                            }
                        } else if (i13 < 0) {
                            break;
                        } else {
                            size4 = i13;
                        }
                    }
                }
                if (i12 < 0) {
                    break;
                }
                size3 = i12;
            }
        }
        int size5 = this.additionsList.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i14 = size5 - 1;
                ArrayList<RecyclerView.f0> arrayList5 = this.additionsList.get(size5);
                q.h(arrayList5, "get(...)");
                ArrayList<RecyclerView.f0> arrayList6 = arrayList5;
                if (arrayList6.remove(f0Var)) {
                    view.setAlpha(1.0f);
                    dispatchAddFinished(f0Var);
                    if (arrayList6.isEmpty()) {
                        this.additionsList.remove(size5);
                    }
                }
                if (i14 < 0) {
                    break;
                }
                size5 = i14;
            }
        }
        this.removeAnimations.remove(f0Var);
        this.addAnimations.remove(f0Var);
        this.changeAnimations.remove(f0Var);
        this.moveAnimations.remove(f0Var);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void endAnimations() {
        View view;
        int size = this.pendingMoves.size();
        while (true) {
            size--;
            View view2 = null;
            if (-1 >= size) {
                break;
            }
            MoveInfo moveInfo = this.pendingMoves.get(size);
            q.h(moveInfo, "get(...)");
            MoveInfo moveInfo2 = moveInfo;
            RecyclerView.f0 holder = moveInfo2.getHolder();
            if (holder != null) {
                view2 = holder.itemView;
            }
            if (view2 != null) {
                view2.setTranslationY(0.0f);
            }
            if (view2 != null) {
                view2.setTranslationX(0.0f);
            }
            dispatchMoveFinished(moveInfo2.getHolder());
            this.pendingMoves.remove(size);
        }
        for (int size2 = this.pendingRemovals.size() - 1; -1 < size2; size2--) {
            RecyclerView.f0 f0Var = this.pendingRemovals.get(size2);
            q.h(f0Var, "get(...)");
            dispatchRemoveFinished(f0Var);
            this.pendingRemovals.remove(size2);
        }
        int size3 = this.pendingAdditions.size();
        while (true) {
            size3--;
            if (-1 >= size3) {
                break;
            }
            RecyclerView.f0 f0Var2 = this.pendingAdditions.get(size3);
            q.h(f0Var2, "get(...)");
            RecyclerView.f0 f0Var3 = f0Var2;
            f0Var3.itemView.setAlpha(1.0f);
            dispatchAddFinished(f0Var3);
            this.pendingAdditions.remove(size3);
        }
        for (int size4 = this.pendingChanges.size() - 1; -1 < size4; size4--) {
            ChangeInfo changeInfo = this.pendingChanges.get(size4);
            q.h(changeInfo, "get(...)");
            endChangeAnimationIfNecessary(changeInfo);
        }
        this.pendingChanges.clear();
        if (!isRunning()) {
            return;
        }
        for (int size5 = this.movesList.size() - 1; -1 < size5; size5--) {
            ArrayList<MoveInfo> arrayList = this.movesList.get(size5);
            q.h(arrayList, "get(...)");
            ArrayList<MoveInfo> arrayList2 = arrayList;
            for (int size6 = arrayList2.size() - 1; -1 < size6; size6--) {
                MoveInfo moveInfo3 = arrayList2.get(size6);
                q.h(moveInfo3, "get(...)");
                MoveInfo moveInfo4 = moveInfo3;
                RecyclerView.f0 holder2 = moveInfo4.getHolder();
                if (holder2 != null) {
                    view = holder2.itemView;
                } else {
                    view = null;
                }
                if (view != null) {
                    view.setTranslationY(0.0f);
                }
                if (view != null) {
                    view.setTranslationX(0.0f);
                }
                dispatchMoveFinished(moveInfo4.getHolder());
                arrayList2.remove(size6);
                if (arrayList2.isEmpty()) {
                    this.movesList.remove(arrayList2);
                }
            }
        }
        for (int size7 = this.additionsList.size() - 1; -1 < size7; size7--) {
            ArrayList<RecyclerView.f0> arrayList3 = this.additionsList.get(size7);
            q.h(arrayList3, "get(...)");
            ArrayList<RecyclerView.f0> arrayList4 = arrayList3;
            for (int size8 = arrayList4.size() - 1; -1 < size8; size8--) {
                RecyclerView.f0 f0Var4 = arrayList4.get(size8);
                q.h(f0Var4, "get(...)");
                RecyclerView.f0 f0Var5 = f0Var4;
                View view3 = f0Var5.itemView;
                q.h(view3, "itemView");
                view3.setAlpha(1.0f);
                dispatchAddFinished(f0Var5);
                arrayList4.remove(size8);
                if (arrayList4.isEmpty()) {
                    this.additionsList.remove(arrayList4);
                }
            }
        }
        for (int size9 = this.changesList.size() - 1; -1 < size9; size9--) {
            ArrayList<ChangeInfo> arrayList5 = this.changesList.get(size9);
            q.h(arrayList5, "get(...)");
            ArrayList<ChangeInfo> arrayList6 = arrayList5;
            for (int size10 = arrayList6.size() - 1; -1 < size10; size10--) {
                ChangeInfo changeInfo2 = arrayList6.get(size10);
                q.h(changeInfo2, "get(...)");
                endChangeAnimationIfNecessary(changeInfo2);
                if (arrayList6.isEmpty()) {
                    this.changesList.remove(arrayList6);
                }
            }
        }
        cancelAll(this.removeAnimations);
        cancelAll(this.moveAnimations);
        cancelAll(this.addAnimations);
        cancelAll(this.changeAnimations);
        dispatchAnimationsFinished();
    }

    public final boolean getSkipAnimations() {
        return this.skipAnimations;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean isRunning() {
        if ((!this.pendingAdditions.isEmpty()) != false || (!this.pendingChanges.isEmpty()) != false || (!this.pendingMoves.isEmpty()) != false || (!this.pendingRemovals.isEmpty()) != false || (!this.moveAnimations.isEmpty()) != false || (!this.removeAnimations.isEmpty()) != false || (!this.addAnimations.isEmpty()) != false || (!this.changeAnimations.isEmpty()) != false || (!this.movesList.isEmpty()) != false || (!this.additionsList.isEmpty()) != false || (!this.changesList.isEmpty()) != false) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void runPendingAnimations() {
        long j10;
        long j11;
        long e10;
        boolean z10 = !this.pendingRemovals.isEmpty();
        boolean z11 = !this.pendingMoves.isEmpty();
        boolean z12 = !this.pendingChanges.isEmpty();
        boolean z13 = !this.pendingAdditions.isEmpty();
        if ((!z10 && !z11 && !z13 && !z12) || this.skipAnimations) {
            return;
        }
        Iterator<RecyclerView.f0> it = this.pendingRemovals.iterator();
        while (it.hasNext()) {
            RecyclerView.f0 next = it.next();
            q.f(next);
            animateRemoveImpl(next);
        }
        this.pendingRemovals.clear();
        if (z11) {
            final ArrayList<MoveInfo> arrayList = new ArrayList<>(this.pendingMoves);
            this.movesList.add(arrayList);
            this.pendingMoves.clear();
            Runnable runnable = new Runnable() { // from class: com.habitrpg.android.habitica.ui.helpers.a
                @Override // java.lang.Runnable
                public final void run() {
                    SafeDefaultItemAnimator.runPendingAnimations$lambda$1(arrayList, this);
                }
            };
            if (z10) {
                RecyclerView.f0 holder = arrayList.get(0).getHolder();
                if (holder != null) {
                    View view = holder.itemView;
                    q.h(view, "itemView");
                    p0.n0(view, runnable, getRemoveDuration());
                }
            } else {
                runnable.run();
            }
        }
        if (z12) {
            final ArrayList<ChangeInfo> arrayList2 = new ArrayList<>(this.pendingChanges);
            this.changesList.add(arrayList2);
            this.pendingChanges.clear();
            Runnable runnable2 = new Runnable() { // from class: com.habitrpg.android.habitica.ui.helpers.b
                @Override // java.lang.Runnable
                public final void run() {
                    SafeDefaultItemAnimator.runPendingAnimations$lambda$2(arrayList2, this);
                }
            };
            if (z10) {
                RecyclerView.f0 oldHolder = arrayList2.get(0).getOldHolder();
                if (oldHolder != null) {
                    p0.n0(oldHolder.itemView, runnable2, getRemoveDuration());
                }
            } else {
                runnable2.run();
            }
        }
        if (z13) {
            final ArrayList<RecyclerView.f0> arrayList3 = new ArrayList<>(this.pendingAdditions);
            this.additionsList.add(arrayList3);
            this.pendingAdditions.clear();
            Runnable runnable3 = new Runnable() { // from class: com.habitrpg.android.habitica.ui.helpers.c
                @Override // java.lang.Runnable
                public final void run() {
                    SafeDefaultItemAnimator.runPendingAnimations$lambda$3(arrayList3, this);
                }
            };
            if (!z10 && !z11 && !z12) {
                runnable3.run();
                return;
            }
            long j12 = 0;
            if (z10) {
                j10 = getRemoveDuration();
            } else {
                j10 = 0;
            }
            if (z11) {
                j11 = getMoveDuration();
            } else {
                j11 = 0;
            }
            if (z12) {
                j12 = getChangeDuration();
            }
            e10 = l.e(j11, j12);
            long j13 = j10 + e10;
            if (arrayList3.get(0) != null) {
                View view2 = arrayList3.get(0).itemView;
                q.h(view2, "itemView");
                p0.n0(view2, runnable3, j13);
            }
        }
    }

    public final void setSkipAnimations(boolean z10) {
        this.skipAnimations = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SafeDefaultItemAnimator.kt */
    /* loaded from: classes4.dex */
    public static final class ChangeInfo {
        private int fromX;
        private int fromY;
        private RecyclerView.f0 newHolder;
        private RecyclerView.f0 oldHolder;
        private int toX;
        private int toY;

        private ChangeInfo(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
            this.oldHolder = f0Var;
            this.newHolder = f0Var2;
        }

        public final int getFromX() {
            return this.fromX;
        }

        public final int getFromY() {
            return this.fromY;
        }

        public final RecyclerView.f0 getNewHolder() {
            return this.newHolder;
        }

        public final RecyclerView.f0 getOldHolder() {
            return this.oldHolder;
        }

        public final int getToX() {
            return this.toX;
        }

        public final int getToY() {
            return this.toY;
        }

        public final void setFromX(int i10) {
            this.fromX = i10;
        }

        public final void setFromY(int i10) {
            this.fromY = i10;
        }

        public final void setNewHolder(RecyclerView.f0 f0Var) {
            this.newHolder = f0Var;
        }

        public final void setOldHolder(RecyclerView.f0 f0Var) {
            this.oldHolder = f0Var;
        }

        public final void setToX(int i10) {
            this.toX = i10;
        }

        public final void setToY(int i10) {
            this.toY = i10;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.oldHolder + ", newHolder=" + this.newHolder + ", fromX=" + this.fromX + ", fromY=" + this.fromY + ", toX=" + this.toX + ", toY=" + this.toY + "}";
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ChangeInfo(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i10, int i11, int i12, int i13) {
            this(f0Var, f0Var2);
            q.i(f0Var, "oldHolder");
            q.i(f0Var2, "newHolder");
            this.fromX = i10;
            this.fromY = i11;
            this.toX = i12;
            this.toY = i13;
        }
    }

    private final boolean endChangeAnimationIfNecessary(ChangeInfo changeInfo, RecyclerView.f0 f0Var) {
        boolean z10 = false;
        if (changeInfo.getNewHolder() == f0Var) {
            changeInfo.setNewHolder(null);
        } else if (changeInfo.getOldHolder() != f0Var) {
            return false;
        } else {
            changeInfo.setOldHolder(null);
            z10 = true;
        }
        View view = f0Var != null ? f0Var.itemView : null;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        View view2 = f0Var != null ? f0Var.itemView : null;
        if (view2 != null) {
            view2.setTranslationX(0.0f);
        }
        View view3 = f0Var != null ? f0Var.itemView : null;
        if (view3 != null) {
            view3.setTranslationY(0.0f);
        }
        dispatchChangeFinished(f0Var, z10);
        return true;
    }
}
