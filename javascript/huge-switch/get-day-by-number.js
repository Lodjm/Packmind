function getDayByNumber(day) {
    if (day < 1 || day > 7) throw new Error("day must be in range 1 to 7");
    const days = [
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday"
    ];
    return days[day - 1];
}