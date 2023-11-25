package io.realm;

import com.habitrpg.android.habitica.models.Tag;
import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.models.tasks.Days;
import com.habitrpg.android.habitica.models.tasks.RemindersItem;
import com.habitrpg.android.habitica.models.tasks.TaskGroupPlan;
import java.util.Date;

/* compiled from: com_habitrpg_android_habitica_models_tasks_TaskRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface p5 {
    String realmGet$attributeValue();

    String realmGet$challengeBroken();

    String realmGet$challengeID();

    x0<ChecklistItem> realmGet$checklist();

    String realmGet$combinedID();

    boolean realmGet$completed();

    Integer realmGet$counterDown();

    Integer realmGet$counterUp();

    Date realmGet$dateCreated();

    String realmGet$daysOfMonthString();

    Boolean realmGet$down();

    Date realmGet$dueDate();

    Integer realmGet$everyX();

    String realmGet$frequencyValue();

    TaskGroupPlan realmGet$group();

    boolean realmGet$hasErrored();

    String realmGet$id();

    boolean realmGet$isCreating();

    Boolean realmGet$isDue();

    boolean realmGet$isSaving();

    x0<Date> realmGet$nextDue();

    String realmGet$notes();

    String realmGet$ownerID();

    int realmGet$position();

    float realmGet$priority();

    x0<RemindersItem> realmGet$reminders();

    Days realmGet$repeat();

    Date realmGet$startDate();

    Integer realmGet$streak();

    x0<Tag> realmGet$tags();

    String realmGet$text();

    String realmGet$typeValue();

    Boolean realmGet$up();

    Date realmGet$updatedAt();

    double realmGet$value();

    String realmGet$weeksOfMonthString();

    boolean realmGet$yesterDaily();

    void realmSet$attributeValue(String str);

    void realmSet$challengeBroken(String str);

    void realmSet$challengeID(String str);

    void realmSet$checklist(x0<ChecklistItem> x0Var);

    void realmSet$combinedID(String str);

    void realmSet$completed(boolean z10);

    void realmSet$counterDown(Integer num);

    void realmSet$counterUp(Integer num);

    void realmSet$dateCreated(Date date);

    void realmSet$daysOfMonthString(String str);

    void realmSet$down(Boolean bool);

    void realmSet$dueDate(Date date);

    void realmSet$everyX(Integer num);

    void realmSet$frequencyValue(String str);

    void realmSet$group(TaskGroupPlan taskGroupPlan);

    void realmSet$hasErrored(boolean z10);

    void realmSet$id(String str);

    void realmSet$isCreating(boolean z10);

    void realmSet$isDue(Boolean bool);

    void realmSet$isSaving(boolean z10);

    void realmSet$nextDue(x0<Date> x0Var);

    void realmSet$notes(String str);

    void realmSet$ownerID(String str);

    void realmSet$position(int i10);

    void realmSet$priority(float f10);

    void realmSet$reminders(x0<RemindersItem> x0Var);

    void realmSet$repeat(Days days);

    void realmSet$startDate(Date date);

    void realmSet$streak(Integer num);

    void realmSet$tags(x0<Tag> x0Var);

    void realmSet$text(String str);

    void realmSet$typeValue(String str);

    void realmSet$up(Boolean bool);

    void realmSet$updatedAt(Date date);

    void realmSet$value(double d10);

    void realmSet$weeksOfMonthString(String str);

    void realmSet$yesterDaily(boolean z10);
}
