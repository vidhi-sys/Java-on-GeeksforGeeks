def join_middle(bound_by, tag_name):
    # Find the middle index (convert to integer for odd-length strings)
    mid = len(bound_by) // 2  # Use integer division
    
    # Split the string into two halves and insert tag_name in between
    return bound_by[:mid] + tag_name + bound_by[mid:]