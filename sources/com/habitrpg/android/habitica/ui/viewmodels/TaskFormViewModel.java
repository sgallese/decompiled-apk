package com.habitrpg.android.habitica.ui.viewmodels;

import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.shared.habitica.models.tasks.Attribute;
import com.habitrpg.shared.habitica.models.tasks.HabitResetOption;
import com.habitrpg.shared.habitica.models.tasks.TaskDifficulty;
import j0.j1;
import j0.y2;
import qc.q;

/* compiled from: TaskFormViewModel.kt */
/* loaded from: classes4.dex */
public final class TaskFormViewModel extends BaseViewModel {
    public static final int $stable = 0;
    private final j1<HabitResetOption> habitResetOption;
    private final j1<Boolean> habitScoringNegative;
    private final j1<Boolean> habitScoringPositive;
    private final j1<Attribute> selectedAttribute;
    private final j1<TaskDifficulty> taskDifficulty;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFormViewModel(UserRepository userRepository, MainUserViewModel mainUserViewModel) {
        super(userRepository, mainUserViewModel);
        q.i(userRepository, "userRepository");
        q.i(mainUserViewModel, "userViewModel");
        this.taskDifficulty = y2.i(TaskDifficulty.EASY, null, 2, null);
        this.selectedAttribute = y2.i(Attribute.STRENGTH, null, 2, null);
        this.habitResetOption = y2.i(HabitResetOption.DAILY, null, 2, null);
        this.habitScoringPositive = y2.i(Boolean.TRUE, null, 2, null);
        this.habitScoringNegative = y2.i(Boolean.FALSE, null, 2, null);
    }

    public final j1<HabitResetOption> getHabitResetOption() {
        return this.habitResetOption;
    }

    public final j1<Boolean> getHabitScoringNegative() {
        return this.habitScoringNegative;
    }

    public final j1<Boolean> getHabitScoringPositive() {
        return this.habitScoringPositive;
    }

    public final j1<Attribute> getSelectedAttribute() {
        return this.selectedAttribute;
    }

    public final j1<TaskDifficulty> getTaskDifficulty() {
        return this.taskDifficulty;
    }
}
