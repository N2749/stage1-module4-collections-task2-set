package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new HashSet<>(firstSet);
        result = result.stream().filter(s -> secondSet.contains(s) && !thirdSet.contains(s)).collect(Collectors.toSet());
        result.addAll(thirdSet.stream().filter(s -> !(firstSet.contains(s) || secondSet.contains(s))).collect(Collectors.toSet()));
        return result;
    }
}
